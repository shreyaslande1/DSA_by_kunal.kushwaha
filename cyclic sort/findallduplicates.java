import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findallduplicates {
    public static void main(String[] args) {
        int[] arr = {1,6,5,2,5,3,4,2};
        List<Integer> ans = findDuplicates(arr);
        System.out.println(ans);
        System.out.println(Arrays.toString(arr));

    }
    static public List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while (i<arr.length) {
            
            int correct = arr[i] -1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
            
        }
        List<Integer> ans = new ArrayList<>();
        for(int j =0;j<arr.length;j++){
            if(arr[j]!=j+1){
                ans.add(arr[j]);
            }
        }
        return ans;
    }
    static void swap(int[] arr, int i, int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
