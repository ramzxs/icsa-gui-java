package flow;

public class ControlFlow {
    public static void main(String[] args) {
        // CONTROL FLOW STATEMENTS

        // if Statement
        boolean a = false;

        if (!a) { // ! (not)
            System.out.println("Evaluated to true");
        }

        int x = 1;
        
        if (x > 0) {
            System.out.println("Positive number");
        }

        if (x == 1) {
            System.out.println("Unique");
        }


        // if-else Statemnent
        char c = 'A';

        if (c == 'X') {
            System.out.println("Exit");
        } else {  // Catch-All
            System.out.println("Continue");
        }


        // if-else-if Statement
        int i = 1;
        long l = 12323264644545L;
        double d = 1.33333333;

        float n = 80.00F;
        float m = (float) 10 / 100; // 10% = 0.100

        float f = 75.50F; // 75.5 + 7.55 = 83.05
        
        if (f + (f * m) < n) {
            System.out.println("Below Normal");
        } else if (f + (f * m) == n) {
            System.out.println("Normal");
        } else { // Catch-All
            System.out.println("Above Normal");
        }
    }
}
