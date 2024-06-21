public class Logic {
    public static void main(String[] args) {
        System.out.println("LOGIC APP");

        // Scanner kb = new Scanner(System.in);
        // String input = kb.nextLine();

        int score = 75;
        System.out.println("Score: " + score);

        int total = 100;
        System.out.println("Total: " + total);

        float quotient = (float) score / total; // 0.15
        int percentage = (int) (quotient * 100); // 0.15 * 100 -> 15.000 -> 15
        System.out.println("Percentage: " + percentage + "%");

        // GRADING SYSTEM
        // A 75-100
        // B 50-74
        // C 0-49

        // LOGICAL EXPRESSION
        // < <= > >= == !=
        // 1 > 10 (false)

        // CONDITIONAL STATEMENTS
        // if (percentage < 50) {
        //     System.out.println("Corresponding Level: C");
        // } else {
        //     if (percentage < 75) {
        //         System.out.println("Corresponding Level: B");
        //     } else {
        //         System.out.println("Corresponding Level: A");
        //     }
        // }

        // LOGIC AND = && (true if both are true)
        // LOGICAL OR = || (true if at least 1 is true)
        // true && false (false)
        // false || true (true)
        if (percentage >= 75 && percentage <= 100) {
            System.out.println("Corresponding Level: A");
        } else if (percentage >= 50 && percentage <= 74) {
            System.out.println("Corresponding Level: B");
        } else if (percentage >= 0 && percentage <= 49) {
            System.out.println("Corresponding Level: C");
        } else {
            System.out.println("Corresponding Level: INVALID");
        }


        // EXERCISE
        // Celsius to Fahrenheit ((0°C × 9/5) + 32 = 32°F)
        // Min and Max from 3 Numbers (1, 2, 3)
    }
}
