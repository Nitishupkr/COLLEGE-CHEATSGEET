public class Day3Pattern {
    public static void main(String[] args) {
        pattern(3);

    }

    static void pattern(int n) {
        int i = 1;
        while (i <= n) {
            for (int j = 0; j < i; j++) {


                System.out.print("*");
            }

            System.out.print(" ");
            i++;
        }

    }

}