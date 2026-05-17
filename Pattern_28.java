package Pattern;

public class Pattern_28 {
    public static void main(String[] args) {
        pattern28(5);
    }
    static void pattern28(int n) {
        for (int i = 0; i < 2 * n; i++) {
            int totalcolsinrow = i > n ? 2 * n - i : i;
             int noofspaces = n - totalcolsinrow;
             for ( int s=0 ; s< noofspaces; s++){
                 System.out.print(" ");
             }
            for (int col = 0; col < totalcolsinrow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
