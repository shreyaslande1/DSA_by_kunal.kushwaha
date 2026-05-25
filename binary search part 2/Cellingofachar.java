import java.util.Arrays;
public class Cellingofachar {
    public static void main(String[] args) {
        char[] arr = {'a', 'c', 'f', 'h'};
        char target = 'f';
        char ans = nextGreatestLetter(arr, target);
        System.out.println(ans);
    }
    //return the index of smallest number which is greater than or equal to target
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] > target) {
                end = mid - 1;   // possible answer, go left
            } else {
                start = mid + 1; // skip equal and smaller
            }
        }

        return letters[start % letters.length]; // for circular case
    }

}
