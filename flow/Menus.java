package flow;

import java.util.Scanner;

public class Menus {
    // Class / Local Variable
    static Scanner kb = new Scanner(System.in);
    static String choice = "";

    public static void main(String[] args) {
        System.out.println("MENUS");        

        do {
            printMenus();
            
            switch (choice) {
                case "1":
                    System.out.println("INTRO");
                    printPressAnyKey();
                    break;
                case "2":
                    System.out.println("BASIC");
                    printPressAnyKey();
                    break;
                case "3":
                    System.out.println("ADVANCED");
                    printPressAnyKey();
                    break;
                case "4":
                    System.out.println("EXPERT");
                    printPressAnyKey();
                    break;
                case "X":
                    System.out.println("Bye!");
                    break;
                default: // Catch All
                    System.out.println("Invalid Choice");
                    printPressAnyKey();
            }
        } while (!choice.equals("X"));
        // choice != "X"
        // choice == "X"

        kb.close();
    }


    static void printMenus() {
        System.out.println("---------------");
        System.out.println("MAIN MENU");
        System.out.println("1. Intro");
        System.out.println("2. Basic");
        System.out.println("3. Advanced");
        System.out.println("4. Expert");
        System.out.println("X. Exit");
        System.out.print("Select: ");
        choice = (kb.nextLine()).trim().toUpperCase();
        System.out.println("---------------");
    }

    static void printPressAnyKey() {
        System.out.println("Press any key to continue...");
        kb.nextLine();
    }
}
