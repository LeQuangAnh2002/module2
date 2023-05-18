package codegym.com.baitap.accessmodifier;

public class TestStudents {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Bao");
        student.setClasses("A0323I1");
        System.out.println(student.toString());
    }
}
