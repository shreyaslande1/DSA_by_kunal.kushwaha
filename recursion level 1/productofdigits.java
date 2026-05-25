public class productofdigits {
    public static void main(String[] args) {
        int n = 1243;
        System.out.println(prod(n));
    }
    static int prod(int n){
        if(n==1){
            return 1;
        }
        int rem = n%10;
        return rem * prod(n/10);
    }
}
