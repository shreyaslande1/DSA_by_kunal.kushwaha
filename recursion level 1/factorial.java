public class factorial {
    public static void main(String[] args) {
        int n = 5;
        int fact = sum(n);
        System.out.println(fact);
    }
    static int facorial(int n){
        if(n==1){
            return 1;
        }
        return (n* facorial(n-1));
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return (n+sum(n-1));    
    }
}