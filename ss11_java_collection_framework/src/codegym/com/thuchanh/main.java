package codegym.com.thuchanh;

import java.util.ArrayList;
import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        ThucHienChucNang chucNang = new ThucHienChucNang();
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("1.Thêm sản phẩm :");
            System.out.println("2.Cập nhật sản phẩm theo Id:");
            System.out.println("3.Tìm kiếm theo tên :");
            System.out.println("4.Xóa sản phẩm theo tên :");
            System.out.println("5.Sắp xếp :");
            System.out.println("-------------------------------");
            System.out.print("Chọn chức năng bạn muốn nhập:");

            int Chon = sc.nextInt();
            switch (Chon) {
                case 1:
                    chucNang.NhapDanhSach();
                    chucNang.XuatDanhSach();
                    break;
                case 2:
                    chucNang.CapNhatThongTin();
                    chucNang.XuatDanhSach();
                    break;
                case 3:
                    chucNang.TimKiem();
                    break;
                case 4:
                    chucNang.Remove();
                    chucNang.XuatDanhSach();
                    break;
                case 5:
                    chucNang.SapXep();
                    chucNang.XuatDanhSach();
                    break;
            }
        }
    }
}
