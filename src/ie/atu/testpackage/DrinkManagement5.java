package ie.atu.testpackage;

import java.util.Scanner;

public class DrinkManagement5
{
    private static Drinks[] drinksArray;
    private static Scanner userInput;
    private static int drinkCount = 0;

    public static void main(String[] args) {
        userInput = new Scanner(System.in);
        
        // Allow user to choose array size
        System.out.println("Enter the maximum number of drinks to store:");
        int maxDrinks = userInput.nextInt();
        drinksArray = new Drinks[maxDrinks];

        while (true) {
            displayMenu();
            int userSelection = userInput.nextInt();

            switch (userSelection) {
                case 1:
                    addDrink();
                    break;
                case 2:
                    deleteDrink();
                    break;
                case 3:
                    showTotalDrinks();
                    break;
                case 4:
                    searchDrinkById();
                    break;
                case 5:
                    System.out.println("Drink Application closing - Goodbye!");
                    userInput.close();
                    return;
                default:
                    System.out.println("Invalid selection. Try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n--- Drink Management System ---");
        System.out.println("(1) Add a Drink");
        System.out.println("(2) Delete a drink");
        System.out.println("(3) Show total number of drinks");
        System.out.println("(4) Search for a Drink by ID");
        System.out.println("(5) Quit");
        System.out.println("Select an option from 1 to 5 and press Enter>");
    }

    private static void addDrink() {
        if (drinkCount >= drinksArray.length) {
            System.out.println("Drink array is full. Cannot add more drinks.");
            return;
        }

        try {
            System.out.println("Enter Serial Number:");
            int serialNumber = userInput.nextInt();

            System.out.println("Enter Brand:");
            String brand = userInput.next();

            System.out.println("Enter Price:");
            float price = userInput.nextFloat();

            System.out.println("Is Sold? (true/false):");
            boolean isSold = userInput.nextBoolean();

            Drinks newDrink = new Drinks(serialNumber, brand, price, isSold);
            drinksArray[drinkCount++] = newDrink;
            System.out.println("Drink added successfully!");
        } catch (Exception e) {
            System.out.println("Error adding drink. Please check your input.");
            userInput.nextLine(); 
        }
    }

    private static void deleteDrink() {
        if (drinkCount == 0) {
            System.out.println("No drinks to delete.");
            return;
        }

        System.out.println("Enter Serial Number to delete:");
        int serialToDelete = userInput.nextInt();

        for (int i = 0; i < drinkCount; i++) {
            if (drinksArray[i].getSerialNumber() == serialToDelete) {
                
                for (int j = i; j < drinkCount - 1; j++) {
                    drinksArray[j] = drinksArray[j + 1];
                }
                drinkCount--;
                System.out.println("Drink deleted successfully!");
                return;
            }
        }
        System.out.println("Drink not found.");
    }

    private static void showTotalDrinks() {
        System.out.println("Total number of drinks: " + drinkCount);
        
        for (int i = 0; i < drinkCount; i++) {
            Drinks drink = drinksArray[i];
            System.out.println("Drink " + (i+1) + ": " + 
                "Serial #" + drink.getSerialNumber() + 
                ", Brand: " + drink.getBrand() + 
                ", Price: €" + drink.getPrice() + 
                ", Sold: " + drink.getIsSold());
        }
    }

    private static void searchDrinkById() {
        if (drinkCount == 0) {
            System.out.println("No drinks to search.");
            return;
        }

        System.out.println("Enter Serial Number to search:");
        int serialToSearch = userInput.nextInt();

        for (int i = 0; i < drinkCount; i++) {
            if (drinksArray[i].getSerialNumber() == serialToSearch) {
                Drinks foundDrink = drinksArray[i];
                System.out.println("Drink Found:");
                System.out.println("Serial Number: " + foundDrink.getSerialNumber());
                System.out.println("Brand: " + foundDrink.getBrand());
                System.out.println("Price: €" + foundDrink.getPrice());
                System.out.println("Sold Status: " + foundDrink.getIsSold());
                return;
            }
        }
        System.out.println("Drink not found.");
    }
}