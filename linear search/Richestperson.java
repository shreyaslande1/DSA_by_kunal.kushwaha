public class Richestperson {
    public static void main(String[] args) {
        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1},
            {1,2,3,4,5}
        };
        int richest = findRichest(accounts);
        System.out.println("The richest person has wealth: " + richest);
    }
    static int findRichest(int [][] accounts){
        //when you start a new column, take a new sum for that row

        int ans = Integer.MIN_VALUE;
        for(int[] row:accounts){
            int sum= 0;
            for(int ele:row){
                sum += ele;
            }
            if(sum>ans){
                ans = sum;
            }
        }
        return ans;
    }
}
