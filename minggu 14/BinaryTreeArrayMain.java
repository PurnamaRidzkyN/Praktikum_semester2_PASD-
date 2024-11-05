import java.util.Scanner;

public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        BinaryTreeArray bta = new BinaryTreeArray();
        Scanner scanner = new Scanner(System.in);

        int[] initialData = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0};
        int idxLast = 6;

        bta.populateData(initialData, idxLast);

        boolean running = true;

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Add data");
            System.out.println("2. Traverse In-Order");
            System.out.println("3. Traverse Pre-Order");
            System.out.println("4. Traverse Post-Order");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to add: ");
                    int value = scanner.nextInt();
                    bta.add(value);
                    break;
                case 2:
                    System.out.println("In-order traversal:");
                    bta.traverseInOrder(0);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Pre-order traversal:");
                    bta.traversePreOrder(0);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Post-order traversal:");
                    bta.traversePostOrder(0);
                    System.out.println();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
