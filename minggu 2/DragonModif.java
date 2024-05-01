import java.util.Scanner;

public class DragonModif {
    int x;
    int y;
    int width;
    int height;

    void moveLeft() {
        if (x < 0 || x > width) {
            detectCollision();
        } else {
            x--;
        }
    }

    void moveRight() {
        if (x < 0 || x > width) {
            detectCollision();
        } else {
            x++;
        }
    }

    void moveUp() {
        if (y < 0 || y > height) {
            detectCollision();
        } else {
            y++;
        }
    }

    void moveDown() {
        if (y < 0 || y > height) {
            detectCollision();
        } else {
            y--;
        }
    }

    void detectCollision() {
        System.out.println("Game Over");
        System.out.println("Press 1 to reset, 0 to exit:");

    Scanner scanner = new Scanner(System.in);
    int choice = scanner.nextInt();
    scanner.nextLine(); // consume the newline character

    switch (choice) {
        case 0:
            System.out.println("Exiting the program");
            System.exit(0);
            break;
        case 1:
            resetGame();
            break;
        default:
            System.out.println("Invalid input. Exiting the program.");
            System.exit(0);
    }

        
    }
    void resetGame() {
        // Set dragon's initial position and dimensions
        x = 1;
        y = 1;
        width = 5;
        height = 5;
    
        System.out.println("Game Reset - Starting again");
    }

    public static void main(String[] args) {
        // Instantiate Dragon
        DragonModif dragon = new DragonModif();

        // Set initial position and dimensions
        dragon.x = 1;
        dragon.y = 1;
        dragon.height = 5;
        dragon.width = 5;
        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Game loop
        while (true) {
            System.out.println("Current Position: (" + dragon.x + ", " + dragon.y + ")");
          
            System.out.println("Enter direction (1 for right, 2 for left, 3 for up, 4 for down) or 0 to exit:");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    dragon.moveRight();
                    break;
                case 2:
                    dragon.moveLeft();
                    break;
                case 3:
                    dragon.moveUp();
                    break;
                case 4:
                    dragon.moveDown();
                    break;
                case 0:
                    System.out.println("Game Over");
                    scanner.close();
                    System.exit(0); // Exit the program
                default:
                    System.out.println("Invalid input. Please enter 1, 2, 3, 4, or 0.");
            }
        }
    }

}