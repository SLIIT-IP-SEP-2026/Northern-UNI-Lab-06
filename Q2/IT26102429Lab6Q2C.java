import java.util.Scanner;

public class IT26102429Lab6Q2C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 10 numbers:");
        int i = 1;
        int sum = 0;
        String result = "";

        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            int num = input.nextInt();
            result = result + num + " ";
            sum = sum + num;
            i++;
        }

        double average = (double) sum / 10;

        System.out.println("\nThe numbers you entered are:");
        System.out.println(result);
        System.out.println("The Sum is : " + sum);
        System.out.println("The Average is : " + average);
    }
}