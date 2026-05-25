public class pelindrom {
    public static void main(String[] args) {
        int n = 1234321;
        // System.out.println(palindrom(n));
        System.out.println(findp(n));
    }
    static int rev(int n){
        int digit = (int)(Math.log10(n))+1;
        // or
        // int m = n;
        // int digit = 0;
        // while (m>0) {
        //     digit++;
        //     m/=10;
        // }
        return helper(n,digit);
    }
    static int helper(int n, int digit){
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        return rem*(int)Math.pow(10, digit-1) +helper(n/10, digit-1);
    }
    static boolean palindrom(int n){
        return n==rev(n);
    }
    static boolean findp(int n){
        rever(n);
        return n == reve;
    }
    static int reve=0;
    static void rever(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        reve = reve*10+rem;
        rever(n/10);
    }
}
