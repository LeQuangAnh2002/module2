package codegym.com.service.Impl;

import codegym.com.model.person.Employee;
import codegym.com.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeSerivceImpl implements EmployeeService {
    static List<Employee> employeeList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Employee employee: employeeList){
            System.out.println(employee.toString());
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập Id:");
        int id = Integer.parseInt(scanner.nextLine());
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
        Employee employee = new Employee(id, name, age, address, phone, gender, email,salary,position,education);
        employeeList.add(employee);
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
