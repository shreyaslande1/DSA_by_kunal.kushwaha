import java.util.List;
import java.util.ArrayList;

public class subset {
    public static void main(String[] args) {
        int[] arr= {1,2,3};
        List<List<Integer>> subset = subset(arr);
        for(List<Integer> list:subset){
            System.out.println(subset);
        }
    }
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n = outer.size();
            for(int i = 0;i<n;i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}
