import java.util.Scanner;

import java.util.InputMismatchException;
public class Question1 {
//    Write a program to calculate the total salary of a person. The user has to enter the basic salary
//            (an integer) and the grade (an uppercase character), and depending upon which the total salary is
//    calculated as -
//    totalSalary = basic + hra + da + allow – pf. where : hra = 20% ofbasic,
//            da = 50% of basic, allow = 1700 if grade = ‘A’, allow = 1500 if grade = ‘B’, allow = 1300
//            if grade = ‘C' or any other character, pf = 11% of basic. Round off the total salary and
//            then print the integral
//    part only.
    public static void main(String [] args){



            // larget numb among the three numb;

                Scanner in =new Scanner(System.in);
                int x=in.nextInt();
                int y=in.nextInt();
                int z=in.nextInt();
                if(x>y){
                    if(x>z){
                        System.out.println("x is greater");
                    }
                }
                else if(y>x){
                    if(y>z){
                        System.out.println("y is larg");
                    }
                }
                else{
                    System.out.println("z is largest");
                }
            }
        }
