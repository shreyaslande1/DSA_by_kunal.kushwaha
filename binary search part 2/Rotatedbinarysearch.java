public class Rotatedbinarysearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        int ans = search(arr,target);
        System.out.println(ans);
    }
    static int search(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int pivot = findpivot(arr);
        if(pivot==-1){
            return binarysearch(arr, target, start, end);
        }
        if(arr[pivot]==target){
            return pivot;
        }
        if(target>=arr[0]){
            return binarysearch(arr, target, 0, pivot-1);
        }
        return binarysearch(arr, target, pivot+1, end);
        
    }
    static int binarysearch(int[] arr, int target, int st, int end){
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid]>target){
                end = mid-1;
            }else if(arr[mid]<target){
                st = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    static int findpivot(int[] arr){
        int st = 0;
        int end = arr.length-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>st && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[st]){
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        return -1;
    }
}
