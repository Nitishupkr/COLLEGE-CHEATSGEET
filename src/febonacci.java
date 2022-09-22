public class febonacci {
    public static void main(String[] args) {
        fibo(6);
        System.out.println(fibo(6));
    }

    static int fibo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibo(n - 1) + (n - 2);

        }
    }
}