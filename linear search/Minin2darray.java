import java.util.Arrays;
public class Minin2darray {
    public static void main(String[] args) {
        int [][] arr = {
            {12,53,56},
            {2,46,54},
            {76,4,8}
        };
        int min = findMin(arr);
        System.out.println("Minimum element in the 2D array: " + min);
    }
    static int findMin(int[][] arr){
        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }
        int min = Integer.MAX_VALUE;
        for(int[] row:arr){
            for(int ele:row){
                if(ele<min){
                    min = ele;
                }
            }
        }
        return min;
    }
}
