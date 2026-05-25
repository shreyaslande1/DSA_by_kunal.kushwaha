import java.util.Arrays;

public class quicksort2{
    public static void main(String[] args) {
        int[] arr = {6,3,2,4,3,7,9,2,1,5};
        System.out.println(Arrays.toString(arr));
        quicksort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quicksort(int[] arr, int low, int high){
        if(low>=high){
            return;
        }
        int st = low;
        int end = high;
        int mid = st+(end-st)/2;
        int pivot = arr[mid];
        while (st<=end) {
            while (arr[st]<pivot) {
                st++;
            }
            while (arr[end]>pivot) {
                end--;
            }
            if(st<=end){
                int temp = arr[st];
                arr[st]=arr[end];
                arr[end] = temp;
                st++;
                end--;
            }
        }
        quicksort(arr, low, end);
        quicksort(arr, st, high);
    }
}