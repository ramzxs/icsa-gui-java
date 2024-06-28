package flow;

import java.util.Scanner;

public class Menus {
    public static void main(String[] args) {
        System.out.println("MENUS");

        Scanner kb = new Scanner(System.in);
        String choice = "";

        do {
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

            switch (choice) {
                case "1":
                    System.out.println("INTRO");
                    System.out.println("Press any key to continue...");
                    kb.nextLine();
                    break;
                case "2":
                    System.out.println("BASIC");
                    System.out.println("Press any key to continue...");
                    kb.nextLine();
                    break;
                case "3":
                    System.out.println("ADVANCED");
                    System.out.println("Press any key to continue...");
                    kb.nextLine();
                    break;
                case "4":
                    System.out.println("EXPERT");
                    System.out.println("Press any key to continue...");
                    kb.nextLine();
                    break;
                case "X":
                    System.out.println("Bye!");
                    break;
                default: // Catch All
                    System.out.println("Invalid Choice");
                    System.out.println("Press any key to continue...");
                    kb.nextLine();
            }
        } while (!choice.equals("X"));
        // choice != "X"
        // choice == "X"

        kb.close();
    }
}
