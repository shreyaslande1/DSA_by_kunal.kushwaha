import java.util.Arrays;
public class quicksort{
    public static void main(String[] args) {
        int[] arr = {6,2,4,5,1,8,9,5};
        quicksor(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quicksor(int[] arr, int low, int hi){
        if(low>=hi){
            return;
        }
        int st = low;
        int end = hi;
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
                arr[st] = arr[end];
                arr[end] = temp;
                st++;
                end--;
            }
        }
        quicksor(arr, low, end);
        quicksor(arr, st, hi);
    }
}