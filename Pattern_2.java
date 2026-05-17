package Pattern;

import java.util.Scanner;

public class Pattern_2 {
    public static void main ( String []args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = input.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

