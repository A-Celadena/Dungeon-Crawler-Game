# Dungeon Crawler

A small, turn-based dungeon exploration game built in Java. Explore a grid of hidden rooms, collect treasure and useful action cards, survive traps and monster encounters, and find the randomly placed boss.

The project is a desktop game built with Java Swing and developed in BlueJ. It is also a portfolio project demonstrating object-oriented programming, collections, two-dimensional arrays, and event-driven UI development.

## Features

- Explore a 5 × 5 dungeon, starting at row 0, column 0.
- Choose an unexplored room next to a room you have already visited.
- Encounter shuffled room cards, including rest sites, treasure, traps, and monsters.
- Fight monsters in turn-based combat using action cards that deal damage, block attacks, or heal.
- Track player health, gold, action cards, and room progress in the game window.
- Find and battle a boss whose room is placed randomly on the map.

## Getting started

### Requirements

- Java Development Kit (JDK) installed.
- A desktop environment that supports Java Swing.

### Run from the terminal

From the repository root, compile the source files and start the game:

```text
cd code
javac ActionCard.java BossCard.java Card.java Deck.java DungeonMap.java GamePanel.java MonsterCard.java Player.java RestCard.java Runner.java TrapCard.java TreasureCard.java
java Runner
```

### Run with BlueJ

Open the `code` folder as a BlueJ project, then run the `main` method in `Runner`.

## How to play

1. The game opens at the starting room, shown at `[START]` on the dungeon map.
2. Enter a row and column from `0` to `4`, then select **Explore Room**. The room must be unexplored and next to a visited room.
3. Resolve the room encounter. During a monster or boss fight, enter the index of an action card from your hand when prompted.
4. Keep an eye on your HP and map. Reaching 0 HP ends the run; defeat the boss to win.

## Project structure

The Java source files are in [`code/`](./code/).

| Class | Responsibility |
| --- | --- |
| `Runner` | Creates the player, deck, map, and boss, then launches the game. |
| `GamePanel` | Builds the Swing interface and coordinates room exploration. |
| `DungeonMap` | Stores the dungeon grid, validates movement, and tracks visited rooms. |
| `Player` | Tracks health, gold, and the player's action-card hand. |
| `Card` | Abstract base class for room encounters. |
| `RestCard`, `TreasureCard`, `TrapCard`, `MonsterCard` | Define room effects and encounters. |
| `BossCard` | Defines the final boss encounter. |
| `ActionCard` | Represents a combat move with damage, block, and healing values. |
| `Deck` | Builds, shuffles, and draws room encounter cards. |

## Skills and what I learned

Building this game gave me practice with:

- **Object-oriented design:** modeling the player, map, deck, and encounters as separate classes with focused responsibilities.
- **Inheritance and polymorphism:** defining shared room-card behavior in an abstract `Card` class and implementing encounter-specific effects in subclasses.
- **Collections and data structures:** using `ArrayList` to manage the deck and the player's action-card hand, and a two-dimensional array to represent the dungeon.
- **Game logic and state:** validating adjacent movement, applying encounter effects, tracking health and progress, and determining win and loss conditions.
- **Java Swing and event-driven programming:** responding to button clicks and coordinating text fields, dialogs, and status displays.
- **Input handling:** checking room coordinates and parsing player choices before applying game actions.

## Built with

- Java
- Java Swing
- BlueJ

## Author

Adrian Celadena
