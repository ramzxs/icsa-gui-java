public class PasswordGenerator {
    public static void main(String[] args) {
        System.out.println("PASSWORD GENERATOR");

        // Password Format:                        Abc_123
        // 1 uppercase letter                      [A ... Z]
        // 1 or more lowercase letters (N times)   [a ... z]
        // 1 symbol                                [ _, #, @, . ]  0-3
        // 1 or more numbers (M times)             [0 ... 9]       0-9

        int N = 10; // 2 small letters
        int M = 5; // 3 digits

        // ALGO
        // 1 Random Big
        // N loop Smalls
        // 1 Random Symbol 
        // M loop Digits

        char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J' };  // [ 0 ... 9]
        char[] digits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        char[] symbols = { '_', '#', '@', '.'};


        String result = "";

        // 1 Big Letter
        int rand = getRandom(letters.length);
        result = result + letters[rand];

        // Nx Small Letters
        for (int i = 1; i <= N; i++) {
            rand = getRandom(letters.length);
            String big = "" + letters[rand];     // "" + 'G' -> "G"
            result = result + big.toLowerCase(); // "G".toLowerCase() -> "g"
        }

        // 1 Symbol
        rand = getRandom(symbols.length);
        result = result + symbols[rand];

        // Mx Digits
        for (int i = 1; i <= M; i++) {
            rand = getRandom(digits.length);
            result = result + digits[rand];
        }


        System.out.println("Result: " + result);
    }

    static int getRandom(int length) {
        int min = 0;          // Lower bound (inclusive)
        int max = length - 1; // Upper bound (inclusive)
        int randomNum = min + (int)(Math.random() * ((max - min) + 1));
        return randomNum;
    }
}
