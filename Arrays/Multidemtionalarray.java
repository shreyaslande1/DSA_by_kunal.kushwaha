import java.util.Scanner;
import java.util.Arrays;
public class Multidemtionalarray {
    public static void main(String[] args) {
        // int[][] arr = new int[3][4];
        //  int[][] arr = {
        //     {1, 2, 3, 4},
        //     {5, 6, 7, 8},
        //     {9, 10, 11, 12}
        // };

        int[][] arr = new int[3][3];

        Scanner in = new Scanner(System.in);

        //taking input in 2d array
        for(int row = 0; row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col] = in.nextInt();
            }
        }

        //printing 2d array
        for(int row = 0; row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

        //printing output by for each loop
        for(int[] row : arr){
            System.out.println(Arrays.toString(row));
        }
    }
}
