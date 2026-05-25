import java.util.Arrays;
//note very impppppppppppppppppppp the cyclic sort works only when your array has elements complete from 1 to n if even there is one element is missing then this method id=s not gonna work
public class Cyclicsort {
    public static void main(String[] args) {
        int[] arr = {6,7,1,9,8,4,5,2,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int i, int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}