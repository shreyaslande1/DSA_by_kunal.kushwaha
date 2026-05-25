import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number to check if it is prime or not: ");
        int n = in.nextInt();
        // checkprime(n);
        boolean a = isprime(n);
        if(a==true){
            System.out.println("yes "+n+" is prime number");
        }else{
            System.out.println("the number "+n+" is not a prime number");
        }

    }
    static void checkprime(int n){
        for(int i = 2;i<n;i++){
            if(n%i==0){
                System.out.println("the number is not prime");
                return;
            }
        }
        System.out.println("the number is prime");
    }
    static boolean isprime(int n){
        int c = 2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
