public class Changenumber {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        System.out.println("Before change: " + java.util.Arrays.toString(arr));
        changeNumber(arr);
        //here in the below line the number will not change because in java the primitive data types are passed by value and when we pass the number to the method we are passing a copy of the number and in the method we are changing the copy of the number but it will not change the original number in the main method.
        System.out.println("After change: " + java.util.Arrays.toString(arr));
    }
    public static void changeNumber(int[] num){
        num[0] = 100;
    }
}
