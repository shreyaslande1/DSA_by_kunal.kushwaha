public class mazepossiblepaths {
    public static void main(String[] args) {
        System.out.println(paths(3,3));
    }
    static int paths(int d, int r){
        if(d==1||r==1){
            return 1;
        }
        int right = paths(d, r-1);
        int down = paths(d-1, r);
        return right+down;
    }
}