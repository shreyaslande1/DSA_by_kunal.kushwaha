public class Floorofnumber {
    public static void main(String[] args) {
        int[] arr = {1, 12, 23, 34, 45, 56, 67, 78, 89};
        int target = 15;
        int ans = floor(arr, target);
        System.out.println(ans);
    }
    //return the index of greatest number which is smaller than or equal to target
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        if(target > arr[end]){
            return -1;
        }
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target ==arr[mid]){
                return arr[mid];
            }
            if(target<arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }

        }
        return arr[end];
    }
}
