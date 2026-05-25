public class Scope {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        System.out.println(c);// this will give an error because the variable c is not declared in the main method and it is declared in the block scope of the main method and it cannot be accessed outside of that block.
        {
            //int a = 100; // this will give an error because we cannot declare a variable with the same name in the same scope.
            int c = 30; // this variable is only accessible within this block and cannot be accessed outside of this block.
            a = 100; // this will change the value of a to 100 because we are accessing the same variable a which is declared in the main method.
            System.out.println(a);
        }
    }
}
