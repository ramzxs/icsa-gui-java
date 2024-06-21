class HelloWorld {
    // Entry Point of the App
    public static void main(String[] args) {
        // Print on the screen
        System.out.print("Hello, World!\n"); // Literal

        // Identifiers
        // Variables
        // dataType variableId;

        String s;
        s = "Hey";
        System.out.println(s); // Variable \n

        String cs = s + ", Name!"; // "Hey, Name!"
        System.out.println(cs);

        // String Concatenation
        // System.out.println("Hello, " + "Ramz" + "(" + 15 + "years old)!\n");

        // %s - String
        // %d - Integer
        // %f - Float
        // %n - New Line Character        
        System.out.format("Hello, %s (%d years old)!%n", "Ramz", 15);
        System.out.println("END");
    }
}



/* Package Information

Import Packages

Class Declaration {
    Members

    Fields

    Methods
} */