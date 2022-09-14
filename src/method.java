import java.util.Arrays;
public class method {

    public static void main(String [] args){
        int [] arr = {22,33,44,55,66};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int [] nums ){
        nums[0]=99;
    }


}
