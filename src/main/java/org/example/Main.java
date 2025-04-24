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

        System.out.println();

        while (true) {

            System.out.println("Options:");
            System.out.println("1. List all items");
            System.out.println("2. Borrow item");
            System.out.println("3. Return item");
            System.out.println("4. Exit");


            try {
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1: library.listAllItems(); break;
                    case 2: library.borrowItem(scanner.next()); break;
                    case 3: library.returnItem(scanner.next()); break;
                    case 4: System.exit(0);
                }

            } catch (Exception e) {
                System.out.println("Invalid option");
            }

        }
    }
}