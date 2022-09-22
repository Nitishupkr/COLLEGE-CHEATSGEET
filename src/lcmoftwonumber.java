public class lcmoftwonumber {
    public static void  main(String [] args){
        int x=9,y=8,gcd=1,lcm;
        for(int i =1;i<=9&&i<=8;i++){
            if(9%i==0&&8%i==0)
                gcd=i;
        }
        lcm=(9*8)/gcd;

        System.out.printf("The LCM of %d and %d is %d.", x, y, lcm);
    }

}
