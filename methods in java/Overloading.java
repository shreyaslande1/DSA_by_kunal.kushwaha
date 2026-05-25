public class Overloading {
    public static void main(String[] args) {
        fun(10);
        fun("shreyash");
        fun(10, 20);
        demo(10, 20, 30, 40, 50);
        demo("shreyash", "patil", "kunal", "shubham");
    }
    public static void fun(int a){
        System.out.println("This is fun with int: " + a);
    }
    public static void fun(String a){
        System.out.println("This is fun with String: " + a);
    }
    public static void fun(int a, int b){
        System.out.println("This is fun with two ints: " + a + ", " + b);
    }
    public static void demo(int ...v){
        System.out.println("This is demo with varargs: " + java.util.Arrays.toString(v));
    }
    public static void demo(String ...v){
        System.out.println("This is demo with varargs: " + java.util.Arrays.toString(v));
    }
}
