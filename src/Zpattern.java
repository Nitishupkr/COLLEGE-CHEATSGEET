 import java.util.Scanner;
public class Zpattern {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                if (row == 0 || row == n - 1 || column == n - 1 - row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


