import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int i = n; i >=1; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print((char)+ (j+64));
            }

            System.out.println();
        }
    }
}

