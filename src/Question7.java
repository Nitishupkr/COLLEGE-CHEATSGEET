public class Question7 {
    public static void main(String [] args){
        pattern(4);
    }
    static void pattern(int n){
        int orginalIN =n;
                n=2*n;
                for(int i=0;i<=n;i++){
                    for(int j=0;j<=n;j++){
                        int everyindex=orginalIN-Math.min(Math.min(i,j),Math.min(n-i,n-j));
                        System.out.print(everyindex + " ");
                    }
                    System.out.println();
                }

    }
}
