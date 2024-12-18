package ie.atu.testpackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int userSelection = 0;

        while (true) {
            System.out.println("");
            System.out.println("(1) Add a Drink.");
            System.out.println("(2) Delete a drink.");
            System.out.println("(3) Show a total number of drinks.");
            System.out.println("(4) Search for a Drink by ID.");
            System.out.println("(5) Quit");
            System.out.println("Select an option from 1 to 5 and press Enter>");

            userSelection = userInput.nextInt();

            if (userSelection == 5) {
                System.out.println("Drink Application closing - Goodbye!");
                userInput.close();
                break;
            }
        }
    }
}