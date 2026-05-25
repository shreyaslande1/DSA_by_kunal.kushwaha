public class skipstring {
    public static void main(String[] args) {
        String s = "abioappldffkb";
        System.out.println(skipappnotapple(s));
    }
    static String skipapple(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if(str.startsWith("apple")){
            return skipapple(str.substring(5));
        }else{
            return ch+skipapple(str.substring(1));
        }
    }

    //skip app word when app is not sub part of apple
    static String skipappnotapple(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if(str.startsWith("app")&& !str.startsWith("apple")){
            return skipappnotapple(str.substring(3));
        }else if(str.startsWith("apple")){
            return skipappnotapple(str.substring(5));
        }else{
            return ch+skipappnotapple(str.substring(1));
        }
    }
}
