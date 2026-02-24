import java.util.Scanner;

public class week2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // First Task
        System.out.print("Enter the current temperature: ");
        double temperature = scanner.nextDouble();

        if (temperature < 0) {
            System.out.println("Below freezing");
        } 
        else if (temperature < 30) {
            System.out.println("Average");
        } 
        else {
            System.out.println("Too hot");
        }

        // Second Task

        double seconds;

        do {
            System.out.print("\nHow many seconds after the lightning did you hear the thunder? ");
            seconds = scanner.nextDouble();

            if (seconds < 0) {
                System.out.println("Seconds cannot be negative. Try again.");
            }

        } while (seconds < 0);

        double distance = seconds * 300;
        System.out.println("The lightning struck around " + distance + " meters away");

        //Third Task
        
        int age;

        do {
            System.out.print("\nHow old are you? (between 1-20): ");
            age = scanner.nextInt();

            if (age < 1 || age > 20) {
                System.out.println("Invalid age. Please enter between 1 and 20.");
            }

        } while (age < 1 || age > 20);

        for (int i = 0; i < age; i++) {
            System.out.print("* ");
        }
        System.out.println();

        for (int i = 0; i < age; i++) {
            System.out.print("| ");
        }
        System.out.println();

        for (int i = 0; i < age * 2; i++) {
            System.out.print("-");
        }
        System.out.println();

        scanner.close();
    }
}

