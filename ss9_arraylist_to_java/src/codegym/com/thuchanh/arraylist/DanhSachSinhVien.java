package codegym.com.thuchanh.arraylist;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
    private ArrayList<Students> danhSach = new ArrayList<Students>() ;

    //Thêm sinh viên vào danh sách
    public void add(Students sv){
        danhSach.add(sv);
    }
    //In danh sách sinh viên ra màn hình
    public void dislay(){
        for (Students student: danhSach){
           if(this.danhSach.isEmpty()){
               System.out.println("Danh sách sinh viên rỗng");
           }else {
               System.out.println(student.toString());
           }
        }
    }
    //Kiểm tra danh sách có rỗng hay không
    public boolean kiemTraDanhSachRong(){
        if(danhSach.isEmpty()){
            return true;
        }
        return false;
    }
    //Lấy số lượng sinh viên trong danh sách
    public int soLuongSinhVien(){
        return danhSach.size();
    }
    //Làm rỗng danh sách sinh viên
    public void lamRongDanhSach(){
        danhSach.removeAll(danhSach);
    }
    //Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên
    public boolean kiemTraTonTai(Students sv){
        return danhSach.contains(sv);
    }
    //Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên
    public boolean xoaSinhVien(Students sv){
        return danhSach.remove(sv);
    }
    //Tìm kiếm tất cả sinh vie dựa trên tên được nhập vaào bàn phím
    public void timSinhVien(String ten){
        for (Students student: danhSach){
            if(student.getHoVaTen().indexOf(ten) >=0){
                System.out.println(student);
            }
        }
    }
    //Xuất ra sinh viên có điểm từ cao đến thấp
    public  void  sapXepSinhVien(){
        Collections.sort(danhSach, new Comparator<Students>() {
            @Override
            public int compare(Students sv1, Students sv2) {
                if (sv1.getDiemTrungBinh() < sv2.getDiemTrungBinh()){
                    return 1;
                }else if(sv1.getDiemTrungBinh() > sv2.getDiemTrungBinh()){
                    return -1;
                }else{
                    return 0;
                }


            }
        });
    }
    //10. Ghi xuống file
    public  void ghiDuLieuXuongFile(File file){

        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            for (Students student: danhSach){
                oos.writeObject(student);
            }
            oos.flush();
            oos.close();
        }catch (IOException e){

        }
    }
}
