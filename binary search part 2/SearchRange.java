import java.util.Arrays;

public class SearchRange {

    static int getvalue(int[] arr, int target, boolean isfirst) {

        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            } 
            else if (arr[mid] > target) {
                end = mid - 1;
            } 
            else {
                ans = mid;

                if (isfirst) {
                    end = mid - 1;   // search left
                } 
                else {
                    start = mid + 1; // search right
                }
            }
        }

        return ans;
    }

    public static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

        ans[0] = getvalue(nums, target, true);
        ans[1] = getvalue(nums, target, false);

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = searchRange(nums, target);

        System.out.println("First and Last Position: " + Arrays.toString(result));
    }
}