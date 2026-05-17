package Pattern;
public class Pattern_5 {
    public static void main(String[] args) {
        pattern5(5);
    }
    static void pattern5(int n) {
        for (int i = 0; i < 2 * n; i++) {
            int totalcolsinrow = i > n ? 2 * n - i : i;
            for (int col = 0; col < totalcolsinrow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}

