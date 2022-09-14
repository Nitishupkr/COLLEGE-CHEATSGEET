public class Factorial {
    public static void main(String[] args) {
        fact(5);
        System.out.println(fact(5));
    }

    static int fact(int n) {
        // base case
        if (n == 0) {
            return 1;
        }
        // calling recursive function
        return n * fact(n - 1);
    }
}