import java.util.Arrays;
public class Selectionsort{
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){     
        for(int i=0;i<arr.length;i++){
            int lastidx = arr.length -1-i;
            int maxidx = maxindex(arr,0,lastidx);
            swap(arr,maxidx,lastidx);

        }
    }
    static int maxindex(int[] arr, int st, int end){
        int max = st;
        for(int i=st;i<=end;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int maxidx,int lastidx){
        int temp = arr[maxidx];
        arr[maxidx] = arr[lastidx];
        arr[lastidx] = temp;
    }
}