import java.util.Arrays;
public class Rowcolmatrix{
    public static void main(String[] args) {
        int[][] arr = {
            {1,3,6,7,8},
            {2,4,7,9,10},
            {3,5,8,11,12},
            {4,6,9,13,14},
            {5,7,10,15,16} 
        };
        int target = 5;
        System.out.println(Arrays.toString(search(arr, target)));
        
    }
    static int[] search(int[][] arr, int target){
        int r = 0;
        int c = arr.length-1;
        while(r<arr.length && c>=0){
            if(arr[r][c]==target){
                return new int[]{r,c};
            }
            if(arr[r][c]>target){
                c--;
            } else {
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}