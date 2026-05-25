public class Shadowing {
    static int a = 10; // this variable is declared in the class scope and it can be accessed by all the methods in the class.
    public static void main(String[] args) {
        System.out.println(a); // this will print 10 because we are accessing the variable a which is declared in the class scope.
        int a; // this variable is declared in the main method scope and it will shadow the variable a which is declared in the class scope and it cannot be accessed outside of the main method scope.
        a = 20; // this will assign the value 20 to the variable a which is declared in the main method scope and it will shadow the variable a which is declared in the class scope.
        System.out.println(a); // this will print 20 because we are accessing the variable a which is declared in the main method scope and it is shadowing the variable a which is declared in the class scope.
        fun();// this will call the fun method and it will print 10 because we are accessing the variable a which is declared in the class scope and it is not shadowed by any variable in the fun method scope.
    
    }
    static void fun(){
        System.out.println(a); // this will print 10 because we are accessing the variable a which is declared in the class scope and it is not shadowed by any variable in the fun method scope.
    }
}
