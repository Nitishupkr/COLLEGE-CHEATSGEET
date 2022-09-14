import java.util.Scanner;
public class Palindrome {
    public static void main(String [] args1){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=0;
      int  temp=n;
        while(n!=0) {
            int rem = n % 10;
            sum = sum * 10 + rem;
            n = n / 10;
        }if(sum ==temp){
            System.out.println("true");

        } else{
            System.out.println(false);
        }

    }
}
