package codegym.com.demo;

public class DemoStudents {
    private int rollno;
    private String name;
    private static  String college = "BBDIT";

    DemoStudents(int rollno, String name){
        this.rollno = rollno;
         this.name = name;
    }
    static void change(){
        college = "CODEGYM";
    }
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String[] args) {
        DemoStudents.change();
        DemoStudents s1 = new DemoStudents(111, "Hoang");
        DemoStudents s2 = new DemoStudents(222, "Khanh");
        DemoStudents s3 = new DemoStudents(333, "Nam");
        s1.display();
        s2.display();
        s3.display();
    }
}
