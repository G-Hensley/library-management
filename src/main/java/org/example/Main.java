package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Adding sample books to library
        library.addItem(new Book("Java Basics", "B001", "Gavin Hensley"));
        library.addItem(new Book("Java Advanced", "B002", "Brenda Hensley"));
        library.addItem(new Book("DSA", "B003", "Apollo Hensley"));

        while (true) {

            System.out.println("\nOptions:");
            System.out.println("1. List all items");
            System.out.println("2. Borrow item");
            System.out.println("3. Return item");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");


            try {
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1: library.listAllItems(); break;
                    case 2: {
                        System.out.print("Enter item ID: ");
                        library.borrowItem(scanner.next());
                        break;
                    }
                    case 3: {
                        System.out.print("Enter item ID: ");
                        library.returnItem(scanner.next());
                        break;
                    }
                    case 4: {
                        System.out.println("Goodbye!");
                        scanner.close();
                        System.exit(0);
                        break;
                    }
                    default:
                        System.out.println("Invalid choice. Enter 1 - 4");
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            } catch (IllegalArgumentException | IllegalStateException e) {
                System.out.println("Error: " + e.getMessage());
            }

        }

    }

}