public class findduplicate{
    public static void main(String[] args) {

        int[] arr = {1,4,3,2,2};
        int a = findmissing(arr);
        System.out.println(a);
    }
    static int findmissing(int[] arr){
        int i =0;
        while (i<arr.length) {
            if(arr[i]!=i+1){
                int correct = arr[i]-1;
                if(arr[i]!=arr[correct]){
                    swap(arr, i, correct);
                }else{
                    return arr[i];
                }
            }else{
                i++;
            }
        }
        return -1;
        
    }
    static void swap(int[] arr, int i, int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}