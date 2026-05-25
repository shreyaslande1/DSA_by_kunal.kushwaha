import java.util.Scanner;
public class Switch{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch (fruit) {
            case "apple":
                System.out.println("this is red");
                break;
            case "mango":
                System.out.println("thia is yello");
            case "grapes":
                System.out.println("thia is small fruit");
            default:
                System.out.println("invalaid fruit");
        }

        //alag switch
        int day = in.nextInt();
        // switch (day){
           
        //     case 1 -> System.out.println("monday");
        //     case 2 -> System.out.println("tuesday");
        //     case 3 -> System.out.println("wednesday");
        //     case 4 -> System.out.println("thursday");
        //     case 5 -> System.out.println("friday");
        //     case 6 -> System.out.println("saturday");
        //     case 7 -> System.out.println("sunday");
        // }

        switch (day){
           
            case 1:
            case 2:
            case 3:
            case 4:
            case 5://this will execute when you press 1,2,3,4
                System.out.println("weekday");
                break;
            case 6:
            case 7:
                System.out.println("weekend");
                break;
        }
        //this over above code
        switch (day) {
            case 1,2,3,4,5->System.out.println("weekday");
            case 6,7 -> System.out.println("weekend");
        }
    }
}