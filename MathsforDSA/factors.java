import java.util.ArrayList;

public class factors {
    public static void main(String[] args) {
        int n = 40;
        printfactors2(n);
    }
    static void printfactors(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println("the factor is "+i);
            }
        }
    }
    static void printfactors2(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i==i){
                    System.out.print(i+" ");
                }else{
                    System.out.print(i+" ");
                    list.add(n/i);
                }
            }

        }
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
}
