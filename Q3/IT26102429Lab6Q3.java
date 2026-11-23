import java.util.Scanner;

public class IT26102429Lab6Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter positive integers (terminate input with -99):");

        int count = 0;
        double sumSquares = 0;

        while (true) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();

            if (num == -99) {
                break;
            }

            if (num < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
                continue;
            }

            sumSquares = sumSquares + (num * num);
            count++;
        }

        if (count > 0) {
            double rms = Math.sqrt(sumSquares / count);
            System.out.println("\nThe Root Mean Square (RMS) is: " + rms);
        } else {
            System.out.println("No numbers entered.");
        }
    }
}