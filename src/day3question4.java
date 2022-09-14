 import java.util.Scanner;
public class day3question4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= n / 2) {
            if (n % i == 0) {
                // if this then only execute the cond
                sum += i;
            }
            i++;

        }
        if (n == sum) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
