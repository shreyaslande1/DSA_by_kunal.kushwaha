public class Findunique {
    public static void main(String[] args) {
        int[] arr = {2,3,4,2,3,6,4};
        System.out.println(findduplicate(arr));

    }
    static int findduplicate(int[] arr){
        int unique = 0;
        for(int n:arr){
            unique ^= n;

        }
        return unique;
    }
}
