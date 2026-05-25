import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(647);
        list.add(47);
        list.add(578);
        list.add(6);
        list.add(215);
        list.add(234);
        list.add(67);
        list.add(35);

        //to check if the list contain any number or not
        System.out.println(list.contains(215));//it will return true because 215 is present in the list
        System.out.println(list.contains(2150));//it will return false because 2150 is not present in the list

        System.out.println(list);//it will print the list in the form of [647, 47, 578, 6, 215, 234, 67, 35]

        //to change the value of any index
        list.set(0, 100);//it will change the value of index 0 to 100

        System.out.println(list);
        
        //to remove any element from the list
        list.remove(2);//it will remove the element at index 2 which is 578
        
        System.out.println(list);
        Scanner in = new Scanner(System.in);

        //to take input in the list
        for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }

        //to print the list
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
