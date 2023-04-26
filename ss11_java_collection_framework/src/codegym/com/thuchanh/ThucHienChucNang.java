package codegym.com.thuchanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ThucHienChucNang {
    ArrayList<Product> arrayList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void NhapDanhSach(){
        System.out.println("Nhập số lượng sản phẩm");
        int n = sc.nextInt();
        for (int i = 0 ; i < n ; i++){
            Product product = new Product();
            product.nhap();
            arrayList.add(product);
        }
    }
    public void XuatDanhSach(){
        for (int i = 0 ; i < arrayList.size(); i++ ){
            Product sp = arrayList.get(i);
            sp.render();

        }
    }

    public void CapNhatThongTin(){
        sc.nextLine();
        System.out.println("Nhập mã sản phẩm cần cập nhật thông tin :");
        String ma = sc.nextLine();
        Product spFound = null;
        for (int i = 0 ; i < arrayList.size(); i++){
            Product sp = arrayList.get(i);
            //sp01 -> SP01, Sp01, sP01
            //sp02
            if(sp.getId().equalsIgnoreCase(ma)){
                    spFound = sp;
                    break;
            }
        }
        if (spFound != null){
            spFound.nhap();

        }else{
            System.out.println("Không tìm thấy thông tin cần cập nhật");
        }
    }
    public void TimKiem() {
        sc.nextLine();
        System.out.println("Nhập tên sản phẩm cần tìm :");
        boolean flag = false;
        String ma = sc.nextLine();
        for (int i = 0; i < arrayList.size(); i++) {
            Product sp = arrayList.get(i);

            if (sp.getTensp().equalsIgnoreCase(ma)) {
                sp.render();
                flag= true;
                break;
            }

        }
        if (flag == false){
            System.out.println("Ko tìm thấy sản phẩm cần tìm");
        }
    }
    public  void Remove(){
        sc.nextLine();
        System.out.println("Nhập mã sản phẩm cần xóa :");
        String ma = sc.nextLine();
        Product productFound = null;
        for (int i = 0 ; i < arrayList.size(); i++){
            Product product = arrayList.get(i);

            if(product.getId().equalsIgnoreCase(ma)){
                productFound = product;
                break;
            }

        }
        if (productFound != null){
                arrayList.remove(productFound);
        }else{
            System.out.println("Không tìm thấy sản phẩm cần xóa :");
        }
    }

    public void SapXep(){

        System.out.println("Nhập mã sản phẩm cần xóa :");
        System.out.println("Nhập 1 Sắp xếp tăng dần");
        System.out.println("Nhập 2 Sắp xếp giảm dần");

        int ma = sc.nextInt();
        if( ma == 1){
            arrayList.sort((sp1, sp2) -> (int) (sp1.getPrice() - sp2.getPrice()));
        }else if(ma == 2){
            arrayList.sort((sp1, sp2) -> (int) (sp2.getPrice() - sp1.getPrice()));
        }

    }
}
