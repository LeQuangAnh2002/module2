import java.util.Scanner;

public class hinhChuNhat {
    public static  void hinhChuNhat(int m,int n){

        for (int i = 0 ; i < m ; i++){
            for (int j = 0; j < n ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public  static  void tamGiacVuong(int m){
        for (int i =0 ; i < m; i++){
            for (int j = 0 ; j < i ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void tamGiacNguoc(int m){
        for (int i =m ; i >= 1; i--){
            for (int j = 0 ; j < i ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){



    }

}
