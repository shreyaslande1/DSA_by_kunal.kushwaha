import java.util.Scanner;

public class Nestedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empid= in.nextInt();
        String department = in.next();

        switch (empid) {
            case 1:
                System.out.println("shreyas lande");
                break;
            case 2:
                System.out.println("vidhi");
                break;
            case 3:
                System.out.println("emp number");
                switch (department) {
                    case "IT":
                        System.out.println("IT dept");

                        break;
                    case "cm":
                        System.out.println("cm dept");
                        break;
                    default:
                        System.out.println("no dept");
                        break;
                }
            default:
                break;
        }
    }
}
