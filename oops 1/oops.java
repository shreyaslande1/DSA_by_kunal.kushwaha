public class oops{
    public static void main(String[] args) {
        student shreyas = new student();
        shreyas.name = "shreyas";
        shreyas.marks = 90;
        shreyas.rno = 2407601;

        System.out.println(shreyas.name+ " " +shreyas.marks+" "+shreyas.rno);
        shreyas.greeting();

        student vidhi = new student();
        vidhi.greeting();
    }
    
}
class student{
    int rno;
    String name;
    int marks;


    void greeting(){
        System.out.println("het my name is "+this.name);
    }

    student(){
        this.name = "vidhi";
        this.rno = 69;
        this.marks = 71;
    }

     student(int rn, String naae, int maks){
        name = naae;
        rno = rn;
        marks = maks;
    }

}