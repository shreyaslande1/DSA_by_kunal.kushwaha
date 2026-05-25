import java.util.Scanner;
public class Sum{
    public static void main(String[] args) {
        // sum();
        System.out.println(sum2());
        System.out.println(sum3(3,5));
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = in.nextInt();
        System.out.print("Enter num2: ");

        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }

    static int sum2(){
         Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = in.nextInt();
        System.out.print("Enter num2: ");

        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
        return sum;
    }
    static int sum3(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
}