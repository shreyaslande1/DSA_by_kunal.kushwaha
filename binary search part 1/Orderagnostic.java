public class Orderagnostic {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        int[] arr2 = {1,2,3,4,5,6,7,8,9};
        int target = 8;
        int result = orderagnostic(arr, target);
        System.out.println("Index of target element: " + result);
        int result2 = orderagnostic(arr2, target);
        System.out.println("Index of target element in ascending array: " + result2);
    }
    static int orderagnostic(int[] arr, int target){
        int start = 0;
        int end  = arr.length-1;
        boolean isascending = arr[start]<arr[end];
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isascending){
                if(arr[mid]<target){
                    start = mid+1;
                }else{
                    end = mid-1;
                }            
            }else{
                if(arr[mid]<target){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }

        }
        return -1;
    }
}
