import java.util.ArrayList;

public class subsequence {
    public static void main(String[] args) {
        String str = "ab";
        ArrayList<String> list = subsequence4("",str);
        System.out.println(list);
        // subsequenceascii("", str);
    }
    static void subsequence(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subsequence(p+ch, up.substring(1));
        subsequence(p, up.substring(1));
    }

    static ArrayList<String> subsequence2(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subsequence2(ch+p,up.substring(1));
        ArrayList<String> right = subsequence2(p,up.substring(1));
        left.addAll(right);
        return left;
    }

    static void subsequenceascii(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subsequenceascii(p+ch, up.substring(1));
        subsequenceascii(p, up.substring(1));
        subsequenceascii(p+(ch+0), up.substring(1));
    }

    static ArrayList<String> subsequence4(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subsequence4(ch+p,up.substring(1));
        ArrayList<String> secoond = subsequence4(p,up.substring(1));
        ArrayList<String> third = subsequence4(p+(ch+0),up.substring(1));
        first.addAll(secoond);
        first.addAll(third);
        return first;
    }
}
