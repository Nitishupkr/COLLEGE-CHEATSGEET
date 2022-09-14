import java.util.Scanner;
public class Question6 {
    public static void main(String [] args){

    int i,j,n;
    Scanner sc = new Scanner(System.in);
    		System.out.println("Enter the no of lines");
    n=sc.nextInt();
    		for(i=n;i>=1;i--)
    {
        for(j=i;j<=n;j++)
        {
            System.out.print((char)(j+64));
        }
        System.out.println("");
    }
}
}