import java.util.Scanner;

public class Bai1 {
    public static void menu(){
        System.out.println("--------------------------------");
        System.out.println("-----1.Hình chữ nhật");
        System.out.println("--------------------------------");
        System.out.println("-----2.Tam giác vuông");
        System.out.println("--------------------------------");
        System.out.println("-----3.Tam giác vuông ngược");
        System.out.println("--------------------------------");
        System.out.println("-----4.Thoát chương trình");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chức năng :");
        int number = sc.nextInt();

        switch (number){
            case 1:
                System.out.print("Nhập số hàng");
                int m= sc.nextInt();
                System.out.print("Nhập số cột");
                int n = sc.nextInt();
                hinhChuNhat.hinhChuNhat(m,n);
                break;
            case 2:
                System.out.print("Nhập số hàng");
                int a= sc.nextInt();
                hinhChuNhat.tamGiacVuong(a);
                break;
            case 3:
                System.out.print("Nhập số hàng");
                int b= sc.nextInt();
                hinhChuNhat.tamGiacNguoc(b);
                break;
            default:
                System.exit(0);
        }
    }
    public static void main(String[] args){
        menu();
    }
}
