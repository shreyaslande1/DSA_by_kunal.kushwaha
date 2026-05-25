import java.util.Arrays;
public class Maaxin2darray {
    public static void main(String[] args) {
        int[][] arr = {
            {12, 53, 56},
            {2, 46, 54},
            {76, 4, 8}
        };
        
        int max = findMax(arr);
        System.out.println("Maximum element in the 2D array: " + max);
    }
    static int findMax(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] row:arr){
            for(int ele:row){
                if(ele>max){
                    max=ele;
                }
            }
        }
        return max;
    }
}
