import java.util.Arrays;
public class Varargs {
    public static void main(String[] args) {
        fun(10,20,30,40,50,60,70,80,90,100);
        multiple(10, 20, "shreyash", "patil", "kunal", "shubham");
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
        
    }
    static void multiple(int a, int b, String ...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
}
