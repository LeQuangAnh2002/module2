package codegym.com.service.Impl;

import codegym.com.model.person.Customer;
import codegym.com.model.person.Employee;
import codegym.com.repository.repo.FileWriteReadCustomer;
import codegym.com.service.CustomerService;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    FileWriteReadCustomer fileWriteReadCustomer = new FileWriteReadCustomer();
    Scanner scanner =new Scanner(System.in);
    List<Customer> customerList = fileWriteReadCustomer.readToOne();

    @Override
    public void display() {
        for (Customer customer: customerList){
            System.out.println(customer);
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
               System.out.println("Nhập Ngày Sinh");
               String ngaySinh = scanner.nextLine();
               System.out.println("Nhập số CMND ");
               String soCMND = scanner.nextLine();
               System.out.println("Nhập Loại Khách");
               String loaiKhach = scanner.nextLine();
                Customer customer = new Customer(id, name, age, address, phone, gender, email,ngaySinh,soCMND,loaiKhach);
                customerList.add(customer);
                fileWriteReadCustomer.writeToOne(customerList);
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
        System.out.print("Nhập mã khách hàng cần cập nhật : ");
        String maKhachHang = scanner.nextLine();
        Customer customer = null;
        for (int i = 0 ; i <customerList.size(); i++ ){
            Customer cer = customerList.get(i);
            if(cer.getId().equalsIgnoreCase(maKhachHang)){
                 customer = cer;
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
                System.out.println("Nhập Ngày Sinh");
                String ngaySinh = scanner.nextLine();
                System.out.println("Nhập số CMND ");
                String soCMND = scanner.nextLine();
                System.out.println("Nhập Loại Khách");
                String loaiKhach = scanner.nextLine();
                customer.setName(name);
                customer.setAge(age);
                customer.setAddress(address);
                customer.setPhone(phone);
                customer.setGender(gender);
                customer.setEmail(email);
                customer.setNgaySinh(ngaySinh);
                customer.setSoCMND(soCMND);
                customer.setLoaiKhach(loaiKhach);
                break;
            }else{
                System.out.println("Ko tồn tại ");
            }

        }
    }

    @Override
    public void delete() {

    }
}
