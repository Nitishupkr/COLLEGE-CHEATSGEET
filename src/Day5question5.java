public class Day5question5 {
    public static void main(String [] args){
        //You have been an integer value N. Your task is to populate the array using the integer values in the
        // range 1 to N(both inclusive) in the order - 1,3,5,7.......8,6,4,2.

       // public class Solution {

            public static void swapAlternate(int arr[]) {

                for(int i = 0; i < (arr.length - 1); i += 2) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }

            }
        }
    }
}
