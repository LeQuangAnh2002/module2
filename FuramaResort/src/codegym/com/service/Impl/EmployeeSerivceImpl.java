package codegym.com.service.Impl;

import codegym.com.model.person.Employee;
import codegym.com.repository.repo.FileWriteRead;
import codegym.com.service.EmployeeService;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class EmployeeSerivceImpl implements EmployeeService {
    FileWriteRead fileWriteRead = new FileWriteRead();
    List<Employee> employeeList = fileWriteRead.readFromFile();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {

        for (Employee employee: employeeList){
            System.out.println(employee);
        }
    }

    @Override
    public void add() {
        boolean flag = false;
        while (!flag){
            try {
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
                String gender = scanner.nextLine();
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
                fileWriteRead.writeToOne( employeeList);
                flag = false;
                break;
            }catch (InputMismatchException e){
                System.out.println("Mời bạn nhập cú pháp ");
                scanner.nextLine();

            }catch (NumberFormatException e){
                System.out.println("Mời bạn nhập lại cú pháp");
                scanner.nextLine();

            }
        }
    }

    @Override
    public void edit() {

        System.out.print("Nhập mã nhân viên cần cập nhật : ");
        String maNhanVien = scanner.nextLine();
        Employee employee = null;
        for (int i = 0 ; i <employeeList.size(); i++ ){
            Employee epl = employeeList.get(i);
            if(epl.getId().equalsIgnoreCase(maNhanVien)){
                employee = epl;
                System.out.println("Nhập Name:");
                String name = scanner.nextLine();
                System.out.println("Nhập Tuổi:");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập Địa Chỉ:");
                String address = scanner.nextLine();
                System.out.println("Nhập Số Điện Thoại :");
                String phone = scanner.nextLine();
                System.out.println("Nhập Giới Tính ");
                String gender = scanner.nextLine();
                System.out.println("Nhập Email ");
                String email = scanner.nextLine();
                System.out.println("Nhập lương ");
                double salary = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập chức vụ ");
                String position = scanner.nextLine();
                System.out.println("Nhập trình độ ");
                String education = scanner.nextLine();
                employee.setName(name);
                employee.setAge(age);
                employee.setAddress(address);
                employee.setPhone(phone);
                employee.setGender(gender);
                employee.setEmail(email);
                employee.setSalary(salary);
                employee.setPosition(position);
                employee.setEducation(education);
                break;
            }else{
                System.out.println("Ko tồn tại ");
            }

        }

    }

    @Override
    public void delete() {
        System.out.println("Nhập mã sản phẩm cần xóa :");
        String maNhanVien = scanner.nextLine();
        Employee employee = null;
        for (int i = 0 ; i < employeeList.size(); i++){
            Employee epl = employeeList.get(i);

            if(employee.getId().equalsIgnoreCase(maNhanVien)){
                employee = epl;
                employeeList.remove(employee);
                break;
            }

        }

    }
}
