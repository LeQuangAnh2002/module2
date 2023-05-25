package codegym.com.controller;

import codegym.com.service.CustomerService;
import codegym.com.service.EmployeeService;
import codegym.com.service.FacilityService;
import codegym.com.service.Impl.CustomerServiceImpl;
import codegym.com.service.Impl.EmployeeSerivceImpl;
import codegym.com.service.Impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {

    public static void displayMainMenu(){
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        while (check){
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ KHU NGHỈ DƯỠNG FURAMA ");
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("6.Exit");
            System.out.println("------------------------");
            int chon = Integer.parseInt(sc.nextLine());
            switch (chon){
                case 1:
                    displayEmployeeManagement();
                    break;
                case 2:
                    displayCustomerManagement();
                    break;
                case 3:
                    displayFacilityManagement();
                    break;
                case 4:
                    displayBookingManagement();
                    break;
                case 5:
                    displayPromotionManagement();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }
    }
    public static void displayEmployeeManagement(){
        EmployeeSerivceImpl employeeService = new EmployeeSerivceImpl();
        boolean check = true;
        while (check){
            System.out.println("-------------------------");
            System.out.println("1.Display list employees");
            System.out.println("2.Add new employee");
            System.out.println("3.Edit employee");
            System.out.println("4.Delete employee");
            System.out.println("5.Back main menu");
            Scanner sc = new Scanner(System.in);
            int chon = Integer.parseInt(sc.nextLine());
            switch (chon){
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.add();
                    break;
                case 3:
                    employeeService.edit();
                    employeeService.display();
                    break;
                case 4:
                    employeeService.delete();
                    break;
                case 5:
                    displayMainMenu();
                    break;

            }

        }

    }
    public static void displayCustomerManagement(){
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        boolean check = true;
        while (check){
            System.out.println("1.Display list customers");
            System.out.println("2.Add new customers");
            System.out.println("3.Edit customers");
            System.out.println("4.Back main menu");
            Scanner sc = new Scanner(System.in);
            int chon =  Integer.parseInt(sc.nextLine());
            switch (chon){
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.add();
                    break;
                case 3:
                    customerService.edit();
                    customerService.display();
                    break;
                case 4:
                    displayMainMenu();
                    break;
            }
        }

    }
    public static void displayFacilityManagement(){
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean check = true;
        while (check){
            System.out.println("------------------------");
            System.out.println("1.Display list facility");
            System.out.println("2.Add new facility");
            System.out.println("3.Display list facility maintenance");
            System.out.println("4.Back main menu");
            Scanner sc = new Scanner(System.in);
            System.out.println("Mời bạn chọn ");
            int chon = Integer.parseInt(sc.nextLine());
            switch (chon){
                case 1:
                    facilityService.display();
                    break;
                case 2:
                    facilityService.add();
                    break;
                case 3:
                    facilityService.baoTri();
                    break;
                case 4:
                    displayMainMenu();
                    break;
            }
        }

    }
    public static void displayBookingManagement(){
        boolean check = true;
        while (check){
            System.out.println("1.Add new booking");
            System.out.println("2.Display list booking");
            System.out.println("3.Create new contracts");
            System.out.println("4.Display list contracts");
            System.out.println("5.Edit contracts");
            System.out.println("6.Back main menu");
            Scanner sc = new Scanner(System.in);
            int chon =  Integer.parseInt(sc.nextLine());
            switch (chon){
                case 1:
                    break;
            }
        }

    }
    public static void displayPromotionManagement(){
        boolean check = true;
        while (check){
            System.out.println("1.Display list customers service");
            System.out.println("2.Display list customers get voucher");
            System.out.println("3.Back main menu");
            Scanner sc = new Scanner(System.in);
            int chon =  Integer.parseInt(sc.nextLine());
            switch (chon){
                case 1:
                    break;
            }
        }

    }

}
