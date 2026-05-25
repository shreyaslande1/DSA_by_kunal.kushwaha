import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        String messege = greet();
        System.out.println(messege);
        String messege2 = greet2("john");
        System.out.println(messege2);
    }
    static String greet(){
        String greeting = "hellow world";
        return greeting;
    }
    static String greet2(String name){
        Scanner in = new Scanner(System.in);
        
        String greeting = "hello "+name;
        return greeting;
    }
}
