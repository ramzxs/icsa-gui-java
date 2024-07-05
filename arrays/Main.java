class Main {
    public static void main(String[] args) {
        System.out.println("ARRAYS");

        // Normal Array
        // Collection of similar-type things

        // Characters -> String / Word
        // ['a', 'p', 'p', 'l', 'e']

        // Numbers -> Set of scores, grades
        // [2, 4, 6, 8, 10]

        // Strings -> Dictionary
        // ["admin", "root", "super", "god"]

        // SYNTAX
        // Definition: dataType[] varName = new dataType[dimension];
        // Assignment/Access: varName[index] (0 ... N-1)
        char[] aWord = new char[5]; // [_, _, _, _, _]
        aWord[0] = 'a';
        aWord[1] = 'p';
        aWord[2] = 'p';
        aWord[3] = 'l';
        aWord[4] = 'e';

        // Normal order
        for (int i = 0; i < 5; i++) {
            System.out.println(aWord[i]);
        }

        // Print the letters in reverse order
        System.out.println("REVERSED");
        for (int i = 4; i >= 0; i--) {
            System.out.println(aWord[i]);
        }
        // System.out.println( aWord[4] );
        // System.out.println( aWord[3] );
        // System.out.println( aWord[2] );
        // System.out.println( aWord[1] );
        // System.out.println( aWord[0] );

        System.out.println("ARRAY OF NUMBERS");
        // 85, 65, 70, 75 -> Sum

        // ALGORITHM / PSEUDOCODE
        // 1. Create an int array
        // 2. Store the numbers
        // 3. Set sum to 0
        // 4. Loop from 0 to 3
        // 4.1 Add item to sum
        // 5. Print sum

        int[] nums = new int[4]; // [ 0 ... 4-1 ]
        nums[0] = 85;
        nums[1] = 65;
        nums[2] = 70;
        nums[3] = 75;

        int sum = 0;
        // sum = sum + nums[0]; // 0 + 85 = 85
        // sum = sum + nums[1]; // 85 + 65 = 150
        // sum = sum + nums[2]; // 150 + 70 = 220
        // sum = sum + nums[3]; // 220 + 75 = 295

        for (int i = 0; i < 4; i++) { // 0 ... 3
            System.out.println(nums[i]);
            // Assignment Syntax
            // varName = value;
            // value = constantOrLiteral | expression
            // constant = 1 | true | 'C' | "String"
            // expression = (term operator term)
            // term = constantLiteral | varName
            // operator = + - * / % ++ --
            sum = sum + nums[i];
        }

        System.out.println("Sum: " + sum);

        System.out.println("ARRAY OF STRINGS");
        // Quote of the day
        // {
        // 0: "An apple a day, makes the doctor away"
        // 1: "Don't let the bed bugs bite"
        // 2: "Know Thyself"
        // }

        String[] quotes = {
            "An apple a day, makes the doctor away",
            "Don't let the bed bugs bite",
            "Know Thyself"
        };

        // ALGO
        // Generate random number between 0 and N-1 (2)
        // Print the quote stored in that number

        int min = 0; // Lower bound (inclusive)
        int max = 2; // Upper bound (inclusive)
        int randomNum = min + (int)(Math.random() * ((max - min) + 1));

        System.out.println( randomNum );
        System.out.println( quotes[randomNum] );
    }
}