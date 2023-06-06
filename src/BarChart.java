import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        String[] players = { "Player 1", "Player 2", "Player 3", "Player 4", "Player 5" };

        Scanner scanner = new Scanner(System.in);

        // Get player input
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number for " + players[i] + " >> ");
            numbers[i] = scanner.nextInt();
        }

        // Display bar chart
        System.out.println("Numbers in Asterisk");

        for (int i = 0; i < 5; i++) {
            System.out.print(players[i] + ": ");
            for (int x = 0; x < numbers[i]; x++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
