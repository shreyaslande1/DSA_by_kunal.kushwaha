public class sortedornot{
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,7,7,1};
        System.out.println(issorted(arr,0));
    }
    static boolean issorted(int[] arr, int index){
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        return issorted(arr, index+1);
    }
}