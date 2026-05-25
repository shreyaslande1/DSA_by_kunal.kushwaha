public class Maxelement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,56,1};
        System.out.println(max(arr));
        System.out.println(maxrange(arr,2,4));
    }
    static int max(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int maxrange(int[] arr, int st, int end){
        int max = arr[st];
        for(int i=st+1;i<=end;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
