import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;
public class insertionsort{
    public static void main(String[] args) {
        int n;
        System.out.println("enter size: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements of arrray: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        insertionsortt(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionsortt(int[] arr, int n){
        for(int i=0;i<n-1;i++){
            for(int j = i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }
            }
        }
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}