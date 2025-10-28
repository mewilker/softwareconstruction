package server;

import com.google.gson.Gson;
import dataaccess.MemoryDataAccess;
import exception.ResponseException;
import model.Pet;
import io.javalin.Javalin;
import io.javalin.http.Context;
import server.websocket.WebSocketHandler;
import service.PetService;

public class PetServer {
    private final PetService service;
    private final WebSocketHandler webSocketHandler;
    private final Javalin httpHandler;

    public PetServer() {
        this(new PetService(new MemoryDataAccess()));
    }

    public PetServer(PetService service) {
        this.service = service;

        webSocketHandler = new WebSocketHandler();

        httpHandler = Javalin.create(config -> config.staticFiles.add("public"))
                .post("/pet", this::addPet)
                .get("/pet", this::listPets)
                .delete("/pet/{id}", this::deletePet)
                .delete("/pet", this::deleteAllPets)
                .exception(ResponseException.class, this::exceptionHandler)
                .ws("/ws", ws -> {
                    ws.onConnect(webSocketHandler);
                    ws.onMessage(webSocketHandler);
                    ws.onClose(webSocketHandler);
                });
    }

    public PetServer run(int port) {
        httpHandler.start(port);
        return this;
    }

    public int port() {
        return httpHandler.port();
    }

    public void stop() {
        httpHandler.stop();
    }

    private void exceptionHandler(ResponseException ex, Context ctx) {
        ctx.status(ex.toHttpStatusCode());
        ctx.result(ex.toJson());
    }

    private void addPet(Context ctx) throws ResponseException {
        Pet pet = new Gson().fromJson(ctx.body(), Pet.class);
        pet = service.addPet(pet);
        webSocketHandler.makeNoise(pet.name(), pet.sound());
        ctx.result(new Gson().toJson(pet));
    }

    private void listPets(Context ctx) throws ResponseException {
        ctx.result(service.listPets().toString());
    }

    private void deletePet(Context ctx) throws ResponseException {
        var id = Integer.parseInt(ctx.pathParam("id"));
        Pet pet = service.getPet(id);
        if (pet != null) {
            service.deletePet(id);
            webSocketHandler.makeNoise(pet.name(), pet.sound());
            ctx.status(204);
        } else {
            ctx.status(404);
        }
    }

    private void deleteAllPets(Context ctx) throws ResponseException {
        service.deleteAllPets();
        ctx.status(204);
    }
}
