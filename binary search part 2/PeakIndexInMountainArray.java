public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0};
        PeakIndexInMountainArray obj = new PeakIndexInMountainArray();
        int ans = obj.peakIndexInMountainArray(arr);
        System.out.println("Peak index in mountain array: " + ans);
    }
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while(start<end){
            int mid = start + (end - start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
           
        }
        return start;
    }
}
