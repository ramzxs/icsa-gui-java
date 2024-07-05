public class Captcha {
    public static void main(String[] args) {
        System.out.println("CAPTCHA APP");

        // symbols[ 0 ... symbols.length-1 ]
        char[] symbols = {
            'A', 'B', 'C',
            'a', 'b', 'c',
            '1', '2', '3',
            '_', '@', '.', '#'
        };

        int N = 8;

        // ALGO
        // 1. Set result = "";
        // 2. Loop N times
        //    2.1 Generate random number between 0 to symbols.length - 1
        //    2.2 Append the randomly-selected character to result
        // 3. Print result

        String result = "";

        for (int i = 1; i <= N; i++) {
            int min = 0;                  // Lower bound (inclusive)
            int max = symbols.length - 1; // Upper bound (inclusive)
            int randomNum = min + (int)(Math.random() * ((max - min) + 1));
            
            // result = result + i; // "12" + 3 -> "123"
            // result = result + randomNum + ",";
            // System.out.println( symbols[randomNum] );

            result = result + symbols[randomNum];
        }

        System.out.println("Result: " + result);
    }
}
