public class abck {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        knights(board,0,0,4);
    }
    static void knights(boolean[][] board, int row, int col, int target){
        if(target==0){
            display(board);
            System.out.println();
            return;
        }
        if(row==board.length-1){
            return;
        }
        if(col==board.length){
            knights(board, row+1, 0, target);
            return;
        }
        if(issafe(board,row,col)){
            board[row][col] = true;
            knights(board, row, col+1, target-1);
            board[row][col] = false;
        }
        knights(board, row, col+1, target);
    }
    static void display(boolean[][] board){
        for(boolean[] arr:board){
            for(boolean ele:arr){
                if(ele){
                    System.out.print("K ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    static boolean issafe(boolean[][] board, int row, int col){
        if(isvalid(board, row-2, col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }
        if(isvalid(board, row-2, col+1)){
            if(board[row-2][col+1]){
                return false;
            }
        }
        if(isvalid(board, row-1, col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }
        if(isvalid(board, row-1, col+2)){
            if(board[row-1][col+2]){
                return false;
            }
        }
        return true;
    }
    static boolean isvalid(boolean[][] board, int row, int col){
        if(row>=0&&row<board.length && col>=0&&col<board.length){
            return true;
        }
        else{
            return false;
        }
    }
}
