import java.util.Scanner;

public class MazeGame {
    // Define maze size and structure
    static char[][] maze = {
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
            {'#', 'P', ' ', ' ', '#', ' ', ' ', ' ', ' ', '#'},
            {'#', ' ', '#', ' ', '#', ' ', '#', '#', ' ', '#'},
            {'#', ' ', '#', ' ', ' ', ' ', ' ', '#', ' ', '#'},
            {'#', ' ', '#', '#', '#', '#', ' ', '#', ' ', '#'},
            {'#', ' ', ' ', ' ', ' ', '#', ' ', '#', ' ', 'E'},
            {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
    };

    // Player position
    static int playerRow = 1;
    static int playerCol = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gameRunning = true;

        while (gameRunning) {
            printMaze();

            System.out.print("Move (WASD): ");
            char move = scanner.nextLine().toUpperCase().charAt(0);

            switch (move) {
                case 'W': movePlayer(-1, 0); break;  // Move up
                case 'S': movePlayer(1, 0); break;   // Move down
                case 'A': movePlayer(0, -1); break;  // Move left
                case 'D': movePlayer(0, 1); break;   // Move right
                default: System.out.println("Invalid move. Use W, A, S, D.");
            }

            // Check if the player reached the exit
            if (maze[playerRow][playerCol] == 'E') {
                gameRunning = false;
                printMaze();
                System.out.println("Congratulations! You reached the exit!");
            }
        }

        scanner.close();
    }

    // Method to move the player
    public static void movePlayer(int rowMove, int colMove) {
        int newRow = playerRow + rowMove;
        int newCol = playerCol + colMove;

        // Check if the new position is a wall or out of bounds
        if (maze[newRow][newCol] != '#') {
            // Update player position
            maze[playerRow][playerCol] = ' ';  // Clear old position
            playerRow = newRow;
            playerCol = newCol;
            maze[playerRow][playerCol] = 'P';  // Set new position
        } else {
            System.out.println("You hit a wall! Try a different direction.");
        }
    }

    // Method to print the current state of the maze
    public static void printMaze() {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }
}
