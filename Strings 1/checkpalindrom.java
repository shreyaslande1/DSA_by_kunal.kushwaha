public class checkpalindrom {
    public static void main(String[] args) {
        String a = "abcdcba";
        System.out.println(ispelindrom(a));
    }
    static boolean ispelindrom(String str){
        str.toLowerCase();
        for(int i=0;i<=str.length()/2;i++){
            char st = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if(st!=end){
                return false;
            }
        }
        return true;
    }

}
