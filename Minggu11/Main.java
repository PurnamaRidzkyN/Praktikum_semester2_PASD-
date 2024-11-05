import java.util.Scanner;

class Point {
    String question;
    String answer;
    Point nextPoint;

    public Point(String question, String answer, Point nextPoint) {
        this.question = question;
        this.answer = answer;
        this.nextPoint = nextPoint;
    }
}

class ScavengerHuntGame {
    private Point startPoint;
    private Point currentPlayerPoint;

    public ScavengerHuntGame(Point startPoint) {
        this.startPoint = startPoint;
        this.currentPlayerPoint = startPoint;
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        while (currentPlayerPoint != null) {
            System.out.println(currentPlayerPoint.question);
            System.out.print("Jawaban: ");
            String userAnswer = scanner.nextLine().trim().toLowerCase();
            if (userAnswer.equals(currentPlayerPoint.answer.toLowerCase())) {
                System.out.println("Jawaban benar! Anda menuju ke point berikutnya.");
                currentPlayerPoint = currentPlayerPoint.nextPoint;
            } else {
                System.out.println("Jawaban salah, coba lagi!");
            }
        }
        System.out.println("Selamat! Anda menemukan harta karun!");
        scanner.close();
    }
}

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point("10 x 10?", "100", null);
        Point point2 = new Point("55+223?", "278", null);
        Point point3 = new Point("Filsafat apa yang ketidak ada artian semua yang ada di dunia ini?", "Nihilisme", null);

        point1.nextPoint = point2;
        point2.nextPoint = point3;

        ScavengerHuntGame game = new ScavengerHuntGame(point1);
        game.startGame();
    }
}
