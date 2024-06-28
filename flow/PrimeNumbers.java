package flow;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("PRIME NUMBERS");

        // 1 and 100
        // for % if
        for (int i = 2; i <= 100; i++) {
            int whole = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    whole++;
                }
            }

            if (whole == 2) {
                System.out.println(i);
            }
        }
    }
}
