import java.util.Arrays;

public class strings{
    public static void main(String[] args) {
        float f = 421.12328479f;
        // System.out.printf("the modified number is: %.2f",f);
        // System.out.printf("the round value of pie is %.2f",Math.PI);
        System.out.println();

        // System.out.printf("hello my name is %s and i am %s","shreyas","cool");
    
        
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char)('a'+3));

        StringBuilder builder = new StringBuilder();
        // String series = "";
        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);
            System.out.println(ch);
            builder.append(ch);
            // series += ch;
        }
        // System.out.println(series);
        System.out.println(builder.toString());
        
        builder.delete(0, 1);
        builder.reverse();
        System.out.println(builder.toString());

        String a = "shreyas lande";
        System.out.println(Arrays.toString(a.toCharArray()));
        
        System.out.println(Arrays.toString(a.split(" ")));

    }
}