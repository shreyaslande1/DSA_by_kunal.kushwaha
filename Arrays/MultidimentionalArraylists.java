import java.util.ArrayList;
import java.util.Scanner;
public class MultidimentionalArraylists {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //initialization
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }
        Scanner in = new Scanner(System.in);
        //adding elements
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(in.nextInt());
            }
        }
        // System.out.println(list);

        //printing elements
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.get(i).size();j++){
                System.out.print(list.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
