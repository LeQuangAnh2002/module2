package codegym.com.demo;

public class Student {
    int rollno;
    String name;
    static String college = "BackKhoa";
    static  void change(){
        college = "Quoc gia";
    }

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    void display(){
        System.out.println(rollno + " " +  name + " "+ college);
    }

    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111,"Hoàng");
        Student s2 = new Student(222,"Thanh");
        Student s3 = new Student(333,"Nam");
        s1.display();
        s2.display();
        s3.display();
    }
}
