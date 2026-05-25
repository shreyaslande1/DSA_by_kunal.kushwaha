import java.util.*;
public class findgcdandlcm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter two values you want to find their GCD: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int gcd = GCD(a,b);
        System.out.println("the GCD is: "+gcd);
    }
    static int GCD(int a, int b){
        if(a==0){
            return b;
        }
        return GCD(b%a,a);
    }
}
