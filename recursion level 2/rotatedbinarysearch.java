public class rotatedbinarysearch {
    public static void main(String[] args) {
        int[] arr = {6,7,8,9,1,2,3,4,5};
        System.out.println(RBS(arr, 5,0,arr.length-1));
    }
    static int RBS(int[] arr, int target, int st, int end){
        if(st>end){
            return -1;
        }
        int mid = st+(end-st)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[st]<=arr[mid]){
            if(target>=arr[st] && target<=arr[mid]){
                return RBS(arr, target, st, mid-1);
            }else{
                return RBS(arr, target, mid+1, end);
            }
        }else{
            if(target>=arr[mid]&&target<=arr[end]){
                return RBS(arr, target, mid+1, end);
            }
            else{
                return RBS(arr, target, st, mid-1);
            }
        }
        // if(st>end){
        //     return -1;
        // }
        // int mid = st+(end-st)/2;
        // if(arr[mid]==target){
        //     return mid;
        // }
        // if(arr[st]<=arr[mid]){
        //     if(target>=arr[st] && arr[target]<=arr[mid]){
        //         return RBS(arr, target, st, mid-1);
        //     }
        //     else{
        //         return RBS(arr, target, mid+1, end);
        //     }
        // }else{
        //     if(arr[target]>=mid&&arr[target]<=arr[end]){
        //         return RBS(arr, target, mid+1, end);
        //     }else{
        //         return RBS(arr, target, st, mid-1);
        //     }
        // }
    }
}
