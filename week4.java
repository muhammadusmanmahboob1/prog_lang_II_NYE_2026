import java.util.Scanner;
import java.util.Random;

public class week4 {
    public static void main(String[] args) {

        // Exercise 1

        if (args.length == 3) {

            String operation = args[0];
            double num1 = Double.parseDouble(args[1]);
            double num2 = Double.parseDouble(args[2]);
            double result = 0;

            if (operation.equals("add")) {
                result = num1 + num2;
                System.out.println("Result: " + result);
            } else if (operation.equals("subtract")) {
                result = num1 - num2;
                System.out.println("Result: " + result);
            } else if (operation.equals("multiply")) {
                result = num1 * num2;
                System.out.println("Result: " + result);
            } else if (operation.equals("divide")) {
                if (num2 == 0) {
                    System.out.println("Cannot be divided by zero");
                    return;
                }
                result = num1 / num2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Operation is not valid");
            }
        } else {
            System.out.println("All three arguments were not passed so the required operation can't be performed");
        }

            // Exercise 2

            Scanner input = new Scanner(System.in);
            Random random = new Random();

            int secretnum = random.nextInt(100) + 1;
            int guess = 0;

            System.out.println("Guess the number between 1 and 100");

            while (guess != secretnum) {
                System.out.print("Enter guess: ");
                guess = input.nextInt();

                if (guess < secretnum) {
                    System.out.println("Larger!");
                } else if (guess > secretnum) {
                    System.out.println("Smaller");
                } else {
                    System.out.println("Correct. You found the secret number");
                }
            }
            input.close();
    }
}