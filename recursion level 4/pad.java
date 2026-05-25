import java.util.ArrayList;

public class pad{
    public static void main(String[] args) {
        String in = "12";
        System.out.println(pad("",in));
        
    }
    // static void pad(String p, String up){
    //     if(up.isEmpty()){
    //         System.out.println(p);
    //         return;
    //     }
    //     int digit = up.charAt(0)-'0';
    //     for(int i = (digit-1)*3;i<digit*3;i++){
    //         char ch = (char)('a'+i);
    //         pad(p+ch,up.substring(1));
    //     }
    // }
    static ArrayList<String> pad(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        int digit = up.charAt(0)-'0';
        for(int i = (digit-1)*3;i<digit*3;i++){
            char ch = (char)('a'+i);
            list.addAll(pad(p+ch,up.substring(1)));
        }
        return list;
    }
    static int count(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int digit = up.charAt(0)-'0';
        int count = 0;
        for(int i = (digit-1)*3;i<digit*3;i++){
            char ch = (char)('a'+i);
            count  = count+count(p+ch, up.substring(1));
        }
        return count;
    }
}