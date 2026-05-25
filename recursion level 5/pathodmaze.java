import java.util.ArrayList;

public class pathodmaze {
    public static void main(String[] args) {
        // path("",3,3);
        //  ArrayList<String> list = new ArrayList<>();
        //  list = pathreturn("", 3, 3);
        //  System.out.println(list);
        Boolean [][] trap = {
            {true,true,true},
            {true,false,true},
            {true,true,true},
        };
        mazewithrestrictions("",trap,0,0);
    }
    static void path(String p, int c, int r){
        if(c==1&&r==1){
            System.out.println(p);
            return;
        }
        if(r>1&&c>1){
            path(p+"D", c-1, r-1);
        }
        if(r>1){
            path(p+"H", c, r-1);
        }
        if(c>1){
            path(p+"V", c-1, r);
        }
    }
    static ArrayList<String> pathreturn(String p, int c, int r){
        if(c==1&&r==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1&&c>1){
            list.addAll(pathreturn(p+"D", c-1, r-1));
        }
        if(r>1){
            list.addAll(pathreturn(p+"H", c, r-1));
        }
        if(c>1){
            list.addAll(pathreturn(p+"V", c-1, r));
        }
        return list;
    }
    static void mazewithrestrictions(String p, Boolean [][] trap, int r, int c){
        if(r==trap.length-1 && c==trap[0].length-1){
            System.out.println(p);
            return;
        }
        if(trap[r][c]==false){
            return;
        }
        if(r<trap.length-1){
        mazewithrestrictions(p+"R", trap, r+1, c);
        }
        if(c<trap[0].length-1){
        mazewithrestrictions(p+"D", trap, r, c+1);
        }
    }
    
}
