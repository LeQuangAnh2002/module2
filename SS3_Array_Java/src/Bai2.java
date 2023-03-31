import java.util.Scanner;

public class Bai2
{
//    chèn 1 phần tử vào mảng
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Nhập Mảng
        int daySo[] = new int[15];
        System.out.print("Nhập số phần tử bạn cần :");
        int phanTu = sc.nextInt();
        for (int i = 0 ; i < phanTu;i++){
            System.out.printf("Nhập daySo[%d] = ", i);
            daySo[i] = sc.nextInt();
        }
        //xuất Mảng
        for (int i = 0 ; i < phanTu; i++){
            System.out.printf("daySo[%d] = %d\n" , i , daySo[i]);
        }
        // chèn dữ liệu
        System.out.print("Nhập giá trị chèn :");
        int giaTri = sc.nextInt();
        System.out.print("Vị trí chèn : ");
        int viTri = sc.nextInt();
        for (int i =phanTu-1 ; i >= viTri; i--){
            daySo[i+1] =daySo[i]; // dịch phần tử sang phải 1 vi trí

        }
        daySo[viTri] = giaTri;
        phanTu++;
        for (int i = 0 ; i < phanTu; i++){
            System.out.printf("daySo[%d] = %d\n" , i , daySo[i]);
        }
    }


}
