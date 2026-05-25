import java.util.Scanner;
public class fibonacci{
    public static void main(String args[]){
        // Scanner in = new Scanner(System.in);
        int a = 5;
        int b = fibo(a);
        System.out.println(b);
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}