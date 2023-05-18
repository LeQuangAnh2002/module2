package codegym.com.model.person;

public class Employee extends Person{
    private double salary;
    private String position;
    private String education;

    public Employee() {
    }

    public Employee(double salary, String position, String education) {
        this.salary = salary;
        this.position = position;
        this.education = education;
    }

    public Employee(int id, String name, int age, String address, String phone, boolean gender, String email, double salary, String position, String education) {
        super(id, name, age, address, phone, gender, email);
        this.salary = salary;
        this.position = position;
        this.education = education;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", position='" + position + '\'' +
                ", education='" + education + '\'' +
                super.toString()+
                '}';
    }
}
