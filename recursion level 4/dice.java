import java.util.ArrayList;

public class dice{
    public static void main(String[] args) {
        ArrayList<String> list = dice("",4);

        System.out.println(list);
    }
    static ArrayList<String> dice(String p, int target){
        if(target==0){
            ArrayList<String> listt = new ArrayList<>();
            listt.add(p);
            return listt;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i=1;i<=6&&i<=target;i++){
            list.addAll(dice(p+i, target-i));
        }
        return list;
    }
}