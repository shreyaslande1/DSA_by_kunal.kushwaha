import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.println("enter the operator");
            char op = in.next().trim().charAt(0);
            System.out.println();
            if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%'){
                System.out.print("enter two numbers");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                System.out.println();
                if(op=='+'){
                    ans = num2+num1;
                }else if(op=='-'){
                    ans = num1-num2;

                }else if(op=='*'){
                    ans = num1*num2;
                }else if(op=='/'){
                    ans = num1/num2;
                }
                else if(op=='%'){
                    ans = num1%num2;
                }else{
                    System.out.println("you have putted wrong operator");
                }
            }else if(op=='='||op=='='){
                break;
            }else{
                System.out.println("invalaid operator");
            }
        }
        System.out.println(ans);
    }
}
