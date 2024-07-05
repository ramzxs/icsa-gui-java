public class PasswordGenerator {
    public static void main(String[] args) {
        System.out.println("PASSWORD GENERATOR");

        // Password Format:                        Abc_123
        // 1 uppercase letter                      [A ... Z]
        // 1 or more lowercase letters (N times)   [a ... z]
        // 1 symbol                                [ _, #, @, . ]  0-3
        // 1 or more numbers (M times)             [0 ... 9]       0-9

        int N = 2; // 2 small letters
        int M = 3; // 3 digits

        // ALGO
        // 1 Random
        // N loop
        // 1 Random
        // M loop

        System.out.println( getRandom(26) );
        System.out.println( getRandom(26) );
        System.out.println( getRandom(4)  );
        System.out.println( getRandom(10) );
    }

    static int getRandom(int length) {
        int min = 0;          // Lower bound (inclusive)
        int max = length - 1; // Upper bound (inclusive)
        int randomNum = min + (int)(Math.random() * ((max - min) + 1));
        return randomNum;
    }
}
