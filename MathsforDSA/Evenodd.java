import java.util.Scanner;
public class Evenodd{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(isodd(n)){
            System.out.println("number is odd");
        }
        if(iseven(n)){
            System.out.println("the number is even");
        }
    }
    static boolean isodd(int n){
        return (n & 1) == 1;
    }
    static boolean iseven(int n){
        return (n&1)==0;
    }
}