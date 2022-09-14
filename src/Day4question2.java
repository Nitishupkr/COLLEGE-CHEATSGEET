 import java.util.Scanner;
public class Day4question2 {
public static void main(String [] args){
    //Write a program to find mean and median of five numbers using function
    //double[] input=new double[5];
    double []input ={10,20,30,40,50};
    int n =5,sum=0;
    for(int i=0;i<n;i++){
        sum+=input[i];

    }
    System.out.println(sum/n);
    }
}