import java.util.Scanner;
//Write a C program to accept a coordinate point in a XY coordinate system and determine
// in which quadrant the coordinate point lies.
public class Question3 {
    public static void main(String [] args){
        Scanner in =new Scanner(System.in);
        int x=in.nextInt();
        int y=in.nextInt();
        if(x>0||y>0){
            System.out.println("first");
        }
        else if(x<0||y<0){
            System.out.println("third");

        }
        else if(x>0||y<0){
            System.out.println("second");
        }
        else{
            System.out.println("fourth");
        }
    }

}
