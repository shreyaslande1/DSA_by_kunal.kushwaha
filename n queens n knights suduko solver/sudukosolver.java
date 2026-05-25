public class sudukosolver {
    public static void main(String[] args) {
        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        solve(board);
        display(board);
    }
    static void display(int[][] board){
        for(int[] arr:board){
            for(int ele:arr){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
    static boolean solve(int[][] board){
        int n = board.length;
        int r = -1;
        int c = -1;
        boolean isnotempty = true;
        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==0){
                    r = i;
                    c = j;
                    isnotempty = false;
                    break;
                }
            }
            if(isnotempty==false){
                break;
            }
        }
        if(isnotempty){
            return true;
        }
        for(int i = 1;i<=board.length;i++){
            if(issafe(board, r, c, i)){
                board[r][c] = i;
                if(solve(board)){
                    return true;
                }else{
                    board[r][c] = 0;
                }
            }
        }
        return false;
    }
    static boolean issafe(int[][] board, int row, int col, int num){
        for(int i = 0;i<board.length;i++){
            if(board[row][i]==num){
                return false;
            }
        }
        for(int[] nums:board){
            if(nums[col]==num){
                return false;
            }
        }
        int sqrt =(int)(Math.sqrt(board.length));
        int rowstart = row-row%sqrt;
        int colstart = col-col%sqrt;
        for(int r = rowstart;r<rowstart+sqrt;r++){
            for(int c=colstart;c<colstart+sqrt;c++){
                if(board[r][c]==num){
                    return false;
                }
            }
        }
        return true;
    }
}
