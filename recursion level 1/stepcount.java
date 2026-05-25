public class stepcount{

    public static void main(String[] args) {
        

        int num = 14; // example input
        int result = steps(num);

        System.out.println("Steps required: " + result);
    }

    static int steps(int num) {
        return helper(num, 0);
    }

    static int helper(int n, int step) {
        if (n == 0) {
            return step;
        }

        if (n % 2 == 0) {
            return helper(n / 2, step + 1);
        } else {
            return helper(n - 1, step + 1);
        }
    }
}
