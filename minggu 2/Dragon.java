 public class Dragon {
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

    
}
    }
