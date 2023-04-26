package codegym.com.thuchanh;

import java.util.Scanner;

public class Product {
    private String id;
    private String tensp;
    private double price;

    public Product() {

    }

    public Product(String id, String tensp, double price) {
        this.id = id;
        this.tensp = tensp;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm");
        id  = sc.nextLine();
        System.out.println("Nhập tên sản phẩm ");
        tensp = sc.nextLine();
        System.out.println("Nhập giá sản phẩm ");
         price = sc.nextDouble();

    }
    public void render(){
        System.out.println("Mã sản phẩm :"+ id +" - "+"Tên sản phẩm :"+tensp+ " - " + "Gía sản phẩm :" + price);
    }
}
