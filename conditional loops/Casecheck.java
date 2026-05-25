import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        System.out.println(ch);
        
        if(ch >'a'&& ch<'z'){
            System.out.println("lower case");
        }else if(ch>'A'&& ch<'Z'){
            System.out.println("upper case");
        }
    }
}
