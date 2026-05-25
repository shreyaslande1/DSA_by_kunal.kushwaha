import java.util.Arrays;

public class Selectionsortusingmin {
    public static void main(String[] args) {
        int[] arr={-99,32,0,42,-9,44,99,99,99};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    // static void selection(int[] arr){
        // for(int i=0;i<arr.length-1;i++){
        //     int min = i;
        //     for(int j = i+1;j<arr.length;j++){
        //         if(arr[min]>arr[j]){
        //             min = j;
        //         }   
        //     }
        //     int temp = arr[i];
        //     arr[i] = arr[min];
        //     arr[min] = temp;
        // }
        static void selection(int arr[]){
            for(int i=0;i<arr.length-1;i++){
                int min = i;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[min]>arr[j]){
                        min = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
}

