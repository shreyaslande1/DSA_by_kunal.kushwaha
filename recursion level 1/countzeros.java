public class countzeros {
    public static void main(String[] args) {
        int n = 2301030;
        System.out.println(countzero(n,0));
    }
    static int countzero(int n, int count){
        if(n==0){
            return count;
        }
        int rem = n%10;
        if(rem==0){
            return countzero(n/10, count+1);
        }else{
            return countzero(n/10, count);
        }
        
    }

}
