public class Binarysearch{
    public static void main(String[] args) {
        int[] arr = {1,4,7,9};
        int target = 7;
        int a = bin(arr, target, 0, arr.length-1);
        System.out.println(arr[a]);
    }
    static int bin(int[] arr, int target, int st, int end){
        int mid = st+(end-st)/2;
        if(st>end){
            return -1;
        }
        if(target==arr[mid]){
            return mid;
        }
        if(target>arr[mid]){
            return bin(arr,target,mid+1,end);
        }
        return bin(arr,target,st,mid-1);
    }
}