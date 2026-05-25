public class Patterns{
    public static void main(String[] args) {
        // pattern1(5);
        // pattern2(5);
        // pattern3(5);
        pattern30(5);
    }
    static void pattern1(int n){
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int row = 0;row<n;row++){
            for(int col = 0;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int row=0;row<n;row++){
            for(int col=0;col<n-row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int i=1;i<2*n;i++){
            int totalcol = i>n?2*n-i:i;
            for(int j=0;j<totalcol;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern28(int n){
        for(int i=1;i<n*2;i++){
            int totalcol = i>n?2*n-i:i;
            int totalspaces = n-totalcol;
            for(int k = 0;k<totalspaces;k++){
                System.out.print(" ");
            }
            for(int j = 0;j<totalcol;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern30(int n){
        for(int i=1;i<=n;i++){
            for(int s= 0;s<n-i;s++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int k=2;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}