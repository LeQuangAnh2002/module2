package codegym.com.thuchanh.arraylist;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien dsvn = new DanhSachSinhVien();
        int luaChon = 0;
        do {
            System.out.println("MENU-----------");
            System.out.println("1. Thêm sinh viên vào danh sách. \n"+
                    "2. In danh sách sinh viên ra màn hình. \n"+
                    "3. Kiểm tra danh sách có rỗng hay không. \n"+
                    "4. Lấy số lượng sinh viên trong danh sách. \n"+
                    "5. Làm rỗng danh sách sinh viên. \n"+
                    "6. Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên \n"+
                    "7. Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên \n"+
                    "8. Tìm kiếm tất cả sinh vie dựa trên tên được nhập vaào bàn phím \n"+
                    "9. Xuất ra sinh viên có điểm từ cao đến thấp \n"+
                    "0. Thoát khỏi chương trình ");
            luaChon = sc.nextInt();
            sc.nextLine();
            switch (luaChon){
                case 1:

                        System.out.println("Nhập mã sinh viên :");
                        String maSinhVien = sc.nextLine();
                        System.out.println("Nhập tên sinh viên :");
                        String hoVaTen = sc.nextLine();
                        System.out.println("Nhập năm sinh viên :");
                        int namSinh = sc.nextInt();
                        System.out.println("Nhập điểm sinh viên :");
                        float diemTrungBinh = sc.nextFloat();
                        Students sv = new Students(maSinhVien,hoVaTen,namSinh,diemTrungBinh);
                        dsvn.add(sv);
                        break;

                case 2:
                    dsvn.dislay();
                    break;
                case 3:
                    System.out.println("Danh sách rỗng :"+dsvn.kiemTraDanhSachRong());
                    break;
                case 4:
                    System.out.println("Số lượng sinh viên :"+dsvn.soLuongSinhVien());
                    break;
                case 5:
                    dsvn.lamRongDanhSach();
                    break;
                case 6:
                    System.out.println("Nhập mã sinh viên :");
                    String maCanTim = sc.nextLine();
                    Students student = new Students(maCanTim);
                    System.out.println("Kiểm tra sinh viên có trong danh sách :"+ dsvn.kiemTraTonTai(student));
                    break;
                case 7:
                    System.out.println("Nhập mã sinh viên :");
                    String xoaSinhVien = sc.nextLine();
                    Students student1 = new Students(xoaSinhVien);
                    System.out.println("Xóa sinh viên có trong danh sách :"+ dsvn.xoaSinhVien(student1));
                    break;
                case 8:
                    System.out.println("Nhập tên sinh viên :");
                    String tenTimKiem = sc.nextLine();
                    dsvn.timSinhVien(tenTimKiem);
                    break;
                case 9:
                    dsvn.sapXepSinhVien();
                    dsvn.dislay();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }while (true);
    }
}
