package flow;

public class Functions {
    public static void main(String[] args) {
        System.out.println("FUNCTIONS");

        // Method Call
        doSomething();

        printStars(100, '▓'); // ASCII Alt+178

        System.out.println( getAverage(10, 20, 33) ); // -1
    }

    // void
    // null

    // Method Declaration
    static void doSomething() {
        System.out.println("*****");
    }

    static void printStars(int n, char c) {
        for (int i = 1; i <= n; i++) {
            System.out.print(c);
        }
        System.out.println();
    }

    static void doNothing() {
    }

    static int getAverage(int a, int b) {
        return ((a + b) / 3);
    }

    static int getAverage(int a, int b, int c) {
        return ((a + b + c) / 3);
    }

    /* Functions/Methods
    [modifiers] returnDataType functionIdentifier([darameter1DataType parameter1Id]) {
        return value;
    }
    */
}
