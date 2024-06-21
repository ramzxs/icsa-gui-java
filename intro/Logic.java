public class Logic {
    public static void main(String[] args) {
        System.out.println("LOGIC APP");

        // Scanner kb = new Scanner(System.in);
        // String input = kb.nextLine();

        int v = 15;
        System.out.println("Score: " + v);

        int total = 100;
        System.out.println("Total: " + total);

        float quotient = (float) v / total; // 0.15
        int percentage = (int) (quotient * 100); // 0.15 * 100 -> 15.000 -> 15
        System.out.println("Percentage: " + percentage + "%");
    }
}
