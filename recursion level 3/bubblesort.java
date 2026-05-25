import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {5,4,4,4,4,5,4,4,5};
        sort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int row, int i){
        if(row==0){
            return;
        }
        if(row>i){
            if(arr[i]>arr[i+1]){
                swap(arr, i+1, i);
                sort(arr, row, i+1);
            }
            sort(arr, row, i+1);
        }
        sort(arr, row-1, 0);
    }
    static void swap(int[] arr, int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
