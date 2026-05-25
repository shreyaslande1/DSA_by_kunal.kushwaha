import java.util.Arrays;

public class allpaths {
    public static void main(String[] args) {
        boolean[][] board = {
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        int[][] path = new int[board.length][board[0].length];
        allpathsprint("", board, 0, 0,path,1);
    }
    static void allpaths(String p, boolean[][] board,int r,int c){
        if(r==board.length-1&&c==board[0].length-1){
            System.out.println(p);
            return;
        }
        if(board[r][c]==false){
            return;
        }
        board[r][c]=false;
        if(r<board.length-1){
            allpaths(p+"R", board, r+1, c);
        }
        if(c<board[0].length-1){
            allpaths(p+"D", board, r, c+1);
        }
        if(r>0){
            allpaths(p+"U", board, r-1, c);
        }
        if(c>0){
            allpaths(p+"L", board, r, c-1);
        }
        board[r][c]=true;
    }
    static void allpathsprint(String p, boolean[][] board,int r,int c, int[][] path, int step){
        if(r==board.length-1&&c==board[0].length-1){
            path[r][c] = step;
            for(int[] ele:path){
                System.out.println(Arrays.toString(ele));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(board[r][c]==false){
            return;
        }
        path[r][c]=step;
        board[r][c]=false;
        if(r<board.length-1){
            allpathsprint(p+"R", board, r+1, c,path,step+1);
        }
        if(c<board[0].length-1){
            allpathsprint(p+"D", board, r, c+1,path,step+1);
        }
        if(r>0){
            allpathsprint(p+"U", board, r-1, c,path,step+1);
        }
        if(c>0){
            allpathsprint(p+"L", board, r, c-1,path,step+1);
        }
        board[r][c]=true;
        path[r][c]=0;
    }
}

