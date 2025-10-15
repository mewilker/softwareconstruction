# Chess

🖥️ [Videos](#videos)

---

![chess board](6-gameplay/highlight-moves.png)

We use the game of chess to help you develop and demonstrate mastery during this course. Your development work is divided into different phases. Each phase demonstrates a different architectural concept or technology.

| Phase            | Getting Started                         | Requirements                            | Video                                 | Description                                                    |
| ---------------- | --------------------------------------- | --------------------------------------- | ------------------------------------- | -------------------------------------------------------------- |
| 0. Chess moves   | [doc](0-chess-moves/getting-started.md) | [doc](0-chess-moves/chess-moves.md)     | [Moves](https://youtu.be/mTtK8iRXsZo) | Initial chess project.                                         |
| 1. Chess game    | [doc](1-chess-game/getting-started.md)  | [doc](1-chess-game/chess-game.md)       |                                       | Creating the game.                                             |
| 2. Server design | None                                    | [doc](2-server-design/server-design.md) |                                       | Designing the chess server.                                    |
| 3. Web API       | [doc](3-web-api/getting-started.md)     | [doc](3-web-api/web-api.md)             |                                       | Creating an HTTP chess server.                                 |
| 4. Database      | [doc](4-database/getting-started.md)    | [doc](4-database/database.md)           |                                       | Persistently storing players, games, and authentication.       |
| 5. Pregame       | [doc](5-pregame/getting-started.md)     | [doc](5-pregame/pregame.md)             |                                       | Creating an command line interface (CLI) for the chess client. |
| 6. Gameplay      | [doc](6-gameplay/getting-started.md)    | [doc](6-gameplay/gameplay.md)           |                                       | Implementing gameplay with multiple players.                   |

## Starter Code

In the Chess [GitHub Repository assignment](chess-github-repository/chess-github-repository.md), you will create an entire copy of the chess project in a personal repository. This repository includes some files which are provided for you to use later in the semester. These are set aside in the `starter-code/` directory of the project. The "Getting Started" instructions for each phase will instruct you on moving these files into the proper location in your project at the appropriate time.

## GitHub Commits

Git is an essential software development tool. It allows you to quickly recover from mistakes, share your code with others, backup your code, and serve as a portfolio of your skills.

> [!NOTE]
>
> You are required to make multiple commits to your public Chess GitHub repository for each phase. Each commit should represent a minor milestone within a phase. For example, after passing each test you should commit your code. Usually, you should have at least ten commits for each phase.

Failure to properly document your efforts with your GitHub history may result in your assignment deliverables being rejected. So make sure you commit your changes consistently and often.

## Deliverables

The following summarizes the deliverables you must provide for each of the different chess phases. Refer to the phase instructions for a full description.

| Phase            | Deliverables                                                                                                                                  |
| ---------------- | --------------------------------------------------------------------------------------------------------------------------------------------- |
| 0. Chess moves   | 1. Complete pass off tests for the chess board and moves code.                                                                                |
| 1. Chess game    | 1. Complete pass off tests for the chess game code.<br/>2. Optionally complete castling and en passant tests for extra credit.                |
| 2. Server design | 1. Create sequence diagrams endpoints, services, and data access components.                                                                  |
| 3. Web API       | 1. Complete pass off tests for the HTTP server<br/>2. Create and complete unit tests for chess service.                                       |
| 4. Database      | 1. Complete serialization pass off test.<br/>2. Create and complete unit tests for the chess database.                                        |
| 5. Pregame       | 1. Create and complete client unit tests.                                                                                                     |
| 6. Gameplay      | 1. Complete pass off tests for WebSocket server.<br/>2. Demonstrate that you can play a game of chess using your server and multiple clients. |

The deliverables in blue represent tests provided by the course start up code that you must pass. The deliverables in green represent unit tests that you must write and pass.

![deliverables](deliverables.png)

## Example

When you complete the entire project, you should have something similar to the following where two client command line programs take turns playing a game of chess.

![chess board](chess-demo.gif)

## Videos

- 🎥 [Phase 0 Overview (21.17)](https://youtu.be/mTtK8iRXsZo) - transcript
