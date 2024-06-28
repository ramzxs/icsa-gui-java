package flow;

public class Loops {
    public static void main(String[] args) {
        // LOOPING

        /* Unary operators: ++ --
        ++a a++ --a a-- */
        int a = 1;
        System.out.println(++a);
        System.out.println(a);

        // do-while Statement
        // Guaranteed 1 pass
        int i = 10;
        do {
            System.out.println("i " + ++i); // 10\n
        } while (i <= 10); // Forever Loop


        // while Statement
        int j = 11;
        while (j <= 10) {
            System.out.println("j " + j++);
        }

        
    }
}
