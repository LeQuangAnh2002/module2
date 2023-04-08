package codegym.com.thuchanh;

public class Student {
    private int rollo;
    private String name;
    private  static String college = "BBDIT";

    public Student(int r , String n) {
        this.rollo = r;
        this.name = n;
    }
     static void change(){
        college = "CODEGYM";
    }
      void display(){
        System.out.println(this.rollo + " " + this.name + " " + college);
    }

}
