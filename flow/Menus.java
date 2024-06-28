package flow;

import java.util.Scanner;

public class Menus {
    public static void main(String[] args) {
        System.out.println("MENUS");

        /*
        ---------------
        MAIN MENU
        1. Intro
        2. Basic
        3. Advanced
        4. Expert
        X. Exit

        Select: 1 (kb.nextLine())

        INTRO / BASIC / ADVANCED / EXPERT
        Press any key to continue... (kb.nextLine())

        Bye!        
        */

        Scanner kb = new Scanner(System.in);
        String in = kb.nextLine();
        kb.close();
    }
}
