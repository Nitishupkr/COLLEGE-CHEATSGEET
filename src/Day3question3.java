public class Day3question3 {
    public static void main(String[] args) {
        tail(5);

    }


    static void tail(int n) {
        if (n == 5) {
            System.out.println(5);
            return ;

        }
        System.out.println("n");
        tail(n + 1);
        // tail recursion is the act of calling the recursive function at the end of the code

    }

}
