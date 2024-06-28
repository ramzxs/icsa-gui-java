package flow;

public class Switch {
    public static void main(String[] args) {
        System.out.println("SWITCH APP");

        // switch Statement
        char civilStatus = 'T';
        
        switch (civilStatus) {
            case 'S': System.out.println("Single"); break;
            case 'M': System.out.println("Married"); break;
            case 'W': System.out.println("Widow/Widower"); break;
            case 'T': System.out.println("Separated"); break;
            default: System.out.println("Invalid");
        }

        // String Equality / Equivalence
        if ("Apple" == "Apple") {
            System.out.println("Equal");
        }

        String s = "Ban" + "ana"; // 123AE
        String t = "BANANA";      // 123AE
        t = "Bana" + "na";
        if (s == t) {             // Memory Address
            System.out.println("Equivalent");
        }

        // Safer String Checking
        String str = "Coconut";
        if (str.equals("Coconut")) {
            System.out.println("Equal");
        }
    }
}
