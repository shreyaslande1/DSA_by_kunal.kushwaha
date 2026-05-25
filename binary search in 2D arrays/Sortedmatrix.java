public class Sortedmatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int target = 5;
        int[] ans = search(arr, target);
        if(ans[0]==-1){
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at: "+ans[0]+", "+ans[1]);
        }
    }
    static int[] binarysearch(int[][] arr, int row, int cstart, int cend, int target){
        while(cstart<=cend){
            int mid = cstart+(cend-cstart)/2;
            if(arr[row][mid]==target){
                return new int[]{row, mid};
            }
            if(arr[row][mid]>target){
                cend = mid-1;
            }else {
                cstart = mid+1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] arr, int target){
        int rows = arr.length;
        int cols = arr[0].length;

        if(rows==0){
            return new int[]{-1,-1};
        }
        if(rows==1){
            return binarysearch(arr, 0, 0, cols-1, target);
        }
        int rstart = 0;
        int rend = rows-1;
        int cmid = cols/2;

        while(rstart<rend-1){
            int mid = rstart+(rend-rstart)/2;
            if(arr[mid][cmid]==target){
                return new int[]{mid, cmid};
            }
            if(arr[mid][cmid]<target){
                rstart=mid;
            }else{
                rend = mid;
            }
        }
        if(arr[rstart][cmid]==target){
            return new int[]{rstart,cmid};
        }
        if(arr[rstart+1][cmid]==target){
            return new int[]{rstart+1,cmid};
        }
        if(arr[rstart][cmid-1]>=target){
            return binarysearch(arr, rstart,0,cmid-1,target);
        }
        if(arr[rstart][cmid+1]<=target && target<=arr[rstart][cols-1]){
            return binarysearch(arr, rstart, cmid+1,cols-1,target);
        }
        if(arr[rstart+1][cmid-1]>=target){
            return binarysearch(arr, rstart+1, 0, cmid-1,target);
        }else{
            return binarysearch(arr, rstart+1, cmid+1, cols-1,target);
        }
    }
}
