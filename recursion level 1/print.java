public class print{
    public static void main(String[] args) {
        int n = 5;
        funboth(n);
    }
    static void fun(int n){
        int i = 0;
        if(n==0){
            return;
        }
        System.out.println(n);
        
        fun(n-1);
        // i+=1;
        // System.out.println(i);
    }
    static void funreverse(int n){
        if(n==0){
            return;
        }
        funreverse(n-1);
        System.out.println(n);
    }
    static void funboth(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        funboth(n-1);
        System.out.println(n);
    }
}