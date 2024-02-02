package Day8.Challenges;

import java.util.Scanner;

public class UserInputValidationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;

        while (true) {
            try {
                System.out.print("Enter a positive integer: ");
                userInput = Integer.parseInt(scanner.nextLine());

                if (userInput > 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive integer.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        System.out.println("You entered a valid positive integer: " + userInput);
    }
}
