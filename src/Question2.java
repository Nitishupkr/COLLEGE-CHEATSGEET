import java.util.Scanner;
public class Question2 {

    // larget numb among the three numb;
    public static void main(String [] args){
        Scanner in =new Scanner(System.in);
        int x=in.nextInt();
        int y=in.nextInt();
        int z=in.nextInt();
         if(x>y&&x>z){

                 System.out.println("x is greater");
             }

         else if(y>x&&y>z){

                 System.out.println("y is larg");
             }

        else{
             System.out.println("z is largest");
         }
    }
}
