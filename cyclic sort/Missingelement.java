public class Missingelement {
    public static void main(String[] args) {
        int[] arr = {6,4,3,2,0,1};
        int a = findmissing(arr);
        System.out.println(a);
    }
    static int findmissing(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }

        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j){
                return j;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr, int i, int corr){
        int temp = arr[i];
        arr[i] = arr[corr];
        arr[corr] = temp;
    }
}
