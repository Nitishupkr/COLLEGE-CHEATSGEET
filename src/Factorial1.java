public class Factorial1 {
    public static void main(String[] args) {
        fact(10);
        System.out.println(fact(10));
    }




    static int fact(int n) {
        int f = 1, sum = 0;
        for (int i = 1; i <=n; i++) {
          sum=sum+(f*i);
        }
        return sum;
    }

}
