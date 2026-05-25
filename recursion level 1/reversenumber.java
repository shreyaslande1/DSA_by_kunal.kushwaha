
public class reversenumber {
    public static void main(String[] args) {
        int n = 1234;
        reverse(n);
        System.out.println(sum);
        // System.out.println(sum);
    }
    static int sum = 0;
    
    static void reverse(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        sum = sum*10+rem;
        reverse(n/10);
    }
    //lets do this in a way such that we dont need to create the sum variable we will return it directly with a helper function
    static int reverse2(int n){
        int m=n;
        int digit = 0;
        while(m>0){
            digit++;
            m=m/10;
        }
        return helper(n,digit);
    }
    static int helper(int n, int digit){
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        return rem*(int)(Math.pow(10, digit-1)) + helper(n/10, digit-1);
    }
}
