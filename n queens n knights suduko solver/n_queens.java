public class n_queens{
    public static void main(String[] args) {
        int n = 4;
        boolean board[][] = new boolean[n][n];
        System.out.println(queens(board, 0));
    }
    static int queens(boolean[][] board, int row){
        if(row==board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for(int col = 0;col<board.length;col++){
            if(issafe(board, row, col)){
                board[row][col]=true;
                count+=queens(board, row+1);
                board[row][col]=false;
            }
        }
        return count;
    }
    static boolean issafe(boolean[][] board, int row, int col){
        for(int i = 0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }
        int maxleft = Math.min(row, col);
        for(int i = 1;i<=maxleft;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        int maxRight = Math.min(row, board.length-col-1);
        for(int i = 1;i <= maxRight;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
    static void display(boolean board[][]){
        for(boolean[] ele:board){
            for(boolean cont:ele){
                if(cont){
                    System.out.print("Q ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}