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
            System.out.println( aWord[i] );
        }

        // Print the letters in reverse order
    }
}