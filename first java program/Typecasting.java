import java.util.Scanner;

public class Typecasting{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        int num2 = input.nextInt();
        System.out.println(num);


        // type casting
        int num3 = (int)(67.84f);
        System.out.print(num3);

        //automatic type promotion in expressions 
        // int a = 257;
        // byte b = (byte)(a); //257%256 = 1;
        // System.out.println(b);
        
        
        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = a*b /c;
        System.out.println(d);
    }
}
