package codegym.com.service.Impl;

import codegym.com.model.facility.Facility;
import codegym.com.model.facility.House;
import codegym.com.model.facility.Room;
import codegym.com.model.facility.Villa;
import codegym.com.repository.repo.FileWriteRedFacility;
import codegym.com.service.EmployeeService;

import java.util.*;

public class FacilityServiceImpl implements EmployeeService {
    FileWriteRedFacility facility = new FileWriteRedFacility();
    Map<Facility,Integer>  facilityIntegerMap = facility.docNho();


    Scanner scanner = new Scanner(System.in);



    @Override
    public void display() {
        for (Facility facilitys: facilityIntegerMap.keySet()){
            Integer value = facilityIntegerMap.get(facilitys);
            System.out.println(facilitys + " - " + value);
        }

    }

    @Override
    public void add() {
        boolean check = true;
        while (check) {
            System.out.println("1.Add new Villa");
            System.out.println("2.Add new House");
            System.out.println("3.Add new Room");
            System.out.println("4.Back main menu");
            int chon = Integer.parseInt(scanner.nextLine());
            switch (chon) {
                case 1:
                    addNewVilla();
                    break;
                case 2:
                    addNewHouse();
                    break;
                case 3:
                    addNewRoom();
                    break;



            }
            check = false;
        }

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    public void addNewVilla() {
        boolean flag = false;
        while (!flag) {
            try {
                System.out.println("Nhập mã dịch vụ :");
                String maDichVu = scanner.nextLine();
                System.out.println("Nhập tên dịch vụ :");
                String tenDichVu = scanner.nextLine();
                System.out.println("Chi phí dịch Vụ :");
                double chiPhiThue = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Số Lượng Tối Da");
                int soLuongToiDa = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Kiểu Thuê");
                String kieuThue = scanner.nextLine();
                System.out.println("Tiêu Chuẩn Phòng");
                String tieuChuanPhong = scanner.nextLine();
                System.out.println("Diện tích hồ bơi");
                double dienTichHoBoi = scanner.nextDouble();
                System.out.println("Số Tầng");
                int soTang = scanner.nextInt();
                Facility villa = new Villa(maDichVu, tenDichVu, chiPhiThue, soLuongToiDa, kieuThue, tieuChuanPhong, dienTichHoBoi, soTang);
                facilityIntegerMap.put(villa,0);
                flag = false;
                break;
            } catch (NumberFormatException e) {
                System.out.println("Có lỗi xảy ra");
                e.printStackTrace();
            }
        }
    }
    public void addNewHouse() {
        boolean flag = false;
        while (!flag) {
            try {
                System.out.println("Nhập mã dịch vụ :");
                String maDichVu = scanner.nextLine();
                System.out.println("Nhập tên dịch vụ :");
                String tenDichVu = scanner.nextLine();
                System.out.println("Chi phí dịch Vụ :");
                double chiPhiThue = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Số Lượng Tối Da");
                int soLuongToiDa = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Kiểu Thuê");
                String kieuThue = scanner.nextLine();
                System.out.println("Tiêu Chuẩn Phòng");
                String tieuChuanPhong = scanner.nextLine();
                System.out.println("Số Tầng");
                int soTang = scanner.nextInt();
                Facility house = new House(maDichVu, tenDichVu, chiPhiThue, soLuongToiDa, kieuThue, tieuChuanPhong, soTang);
                facilityIntegerMap.put(house,0);
                flag = false;
                break;
            } catch (NumberFormatException e) {
                System.out.println("Có lỗi xảy ra");
                e.printStackTrace();
            }
        }
    }
    public void addNewRoom() {
        boolean flag = false;
        while (!flag) {
            try {
                System.out.println("Nhập mã dịch vụ :");
                String maDichVu = scanner.nextLine();
                System.out.println("Nhập tên dịch vụ :");
                String tenDichVu = scanner.nextLine();
                System.out.println("Chi phí dịch Vụ :");
                double chiPhiThue = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Số Lượng Tối Da");
                int soLuongToiDa = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Kiểu Thuê");
                String kieuThue = scanner.nextLine();
                System.out.println("Dịch vụ miễn phí");
                String dichVuMienPhi = scanner.nextLine();

                Facility room = new Room(maDichVu, tenDichVu, chiPhiThue, soLuongToiDa, kieuThue, dichVuMienPhi);
                facilityIntegerMap.put(room,0);
                flag = false;
                break;
            } catch (NumberFormatException e) {
                System.out.println("Có lỗi xảy ra");
                e.printStackTrace();
            }
        }
    }

    public void  baoTri(){
            Map<Facility,Integer> fac = new LinkedHashMap<>();
        for (Facility facilityBaoTri: facilityIntegerMap.keySet()){
            Integer value = facilityIntegerMap.get(facilityBaoTri);
            if( value >= 5){
                    fac.put(facilityBaoTri,value);

                }

            }
            for (Facility key: fac.keySet()){
                Integer value = fac.get(key);
                System.out.println(key+ " - "+ value);

        }

    }

}