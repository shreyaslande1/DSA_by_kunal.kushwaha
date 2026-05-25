import java.util.Arrays;

public class selectionsort {
    
    public static void main(String[] args) {
        int[] arr = {3,1,4,3,5,2};
        sort(arr, arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int r, int i, int max){
        if(r==0){
            return;
        }
        if(r>i){
            if(arr[max]<arr[i]){
                sort(arr, r, i+1, i);
            }else{
                sort(arr, r, i+1, max);
            }
        }else{
            int temp = arr[r];
            arr[r] = arr[max];
            arr[max] = temp;
            sort(arr, r-1, 0, 0);
        }
    }
}
