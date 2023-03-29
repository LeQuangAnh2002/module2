import java.util.Scanner;

public class Bai3 {

    public static boolean soNguyenTo(int number){
        boolean check = true;
        if(number < 2){
            check = false;
        }else{
            for (int i = 2 ; i < number; i++){
                if(number % i == 0){
                    check = false;
                    break;
                }
            }
        }
        return check;
    }

    public static void main(String[] args){
        Bai3 bai3 = new Bai3();
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhập phần tử vào ");
        int num = sc.nextInt();
        for (int i = 2; i < num ; i++){
            if(bai3.soNguyenTo(i)){
                System.out.print(i +"\n");
            }
        }
    }
}
