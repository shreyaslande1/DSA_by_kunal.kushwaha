public class Changename {
    public static void main(String[] args) {
        String name = "shreyash";
        System.out.println("Before change: " + name);
        changeName(name);
        //here in the below line the name will not change because in java the string is immutable and also we are passing the reference of the string to the method and in the method we are changing the reference to point to a new string but it will not change the original reference in the main method.
        System.out.println("After change: " + name);
    }
    static void changeName(String name){
        name = "shreyash patil";
    }
}
