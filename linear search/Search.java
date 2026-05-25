import java.util.Arrays;
public class Search{
    public static void main(String[] args) {
        int[] arr = {12,53,56,2,46,54,76,4,8};
        int target = 53;
        int result = linearSearch(arr, target);
        if(result == -1){
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
        System.out.println(linearSearch1(arr, target));
        System.out.println(linearSearch2(arr, target));
    }
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    static int linearSearch1(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int ele:arr){
            if(ele==target){
                return ele;
            }
        }
        return -1;
    }
    static boolean linearSearch2(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
}