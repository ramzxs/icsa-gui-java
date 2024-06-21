import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        // VARIABLES
        // Storea and manipulate data

        // Variable Declaration
        // Format: dataObjectType identifier;

        // Data Types
        // byte int float double
        // char String
        // boolean

        int a;

        // Assignment statement (Assignment operator =)
        a = 1;
        a = 2;

        // OPERATORS
        // + - * / % (modulo / remainder) 
        // + = String Concatenation operator


        // EXPRESSIONS
        // TERM = variable | literal
        // Syntax: term | (term operator term) | expression operator term
        int b = (a + 3) * 4;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // USER INPUT
        Scanner keyboard = new Scanner(System.in); // OOP

        System.out.print("Enter something: ");
        String input = keyboard.nextLine();        // . = Access operator
        System.out.println("You entered: " + input);

        // CHALLENGE (FIND REMAINDER WITHOUT USING %)
        // Enter the First Number: 10
        // Enter the Second Number: 3
        // Quotient = 3
        // Remainder = 1

        System.out.print("Enter the First Number: ");
        input = keyboard.nextLine();
        a = Integer.parseInt(input);

        System.out.print("Enter the Second Number: ");
        input = keyboard.nextLine();
        b = Integer.parseInt(input);

        System.out.println("Quotient = " + a / b);


        int remainder = ?;
        System.out.println("Remainder = " + remainder);


        keyboard.close();
    }
}
