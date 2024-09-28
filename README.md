# -Simple-Maze-Game-in-Java
Maze Layout: The maze is represented by a 2D array of characters, where # represents walls, P represents the player, and E represents the exit.
Player Movement: The player uses WASD keys to move. The program checks if the movement is valid (not into a wall) and updates the player's position.
Win Condition: The game ends when the player reaches the exit ('E').
Key Components:
Maze Representation: The maze is a 2D character array where different characters represent walls, paths, the player, and the exit.
Player Input: The player inputs their movement direction (W, A, S, D) via the console.
Collision Detection: The program checks if the player's movement is blocked by a wall (#), and only allows movement if the path is clear.
Exit Detection: If the player reaches the exit ('E'), the game displays a win message and stops.
Example Output:
