package codegym.com.model.person;

import java.util.Scanner;

public class Employee extends Person{
    Scanner scanner = new Scanner(System.in);
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

    public Employee(String id, String name, int age, String address, String phone, boolean gender, String email, double salary, String position, String education) {
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

    public void enterText(){
        System.out.println("Nhập Id:");
        String id = scanner.nextLine();
        System.out.println("Nhập Name:");
        String name = scanner.nextLine();
        System.out.println("Nhập Tuổi:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập Địa Chỉ:");
        String address = scanner.nextLine();
        System.out.println("Nhập Số Điện Thoại :");
        String phone = scanner.nextLine();
        System.out.println("Nhập Giới Tính ");
        Boolean gender = scanner.nextBoolean();
        System.out.println("Nhập Email ");
        String email = scanner.nextLine();
        System.out.println("Nhập lương ");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chức vụ ");
        String position = scanner.nextLine();
        System.out.println("Nhập trình độ ");
        String education = scanner.nextLine();
    }

    @Override
    public String toString() {
        return
                super.toString()
                + "\t"+ salary + "\t" + position + "\t" + education;
    }
}
