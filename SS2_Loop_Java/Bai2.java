import java.util.Scanner;

public class Bai2 {
    public boolean soNguyenTo(int number){
        boolean check = true;
        int i ;
        if(number < 2){
            check = false;
        }else{
            for (i = 2; i < number;i++){
                if(number % i == 0){
                    check = false;
                }
            }
        }
        return check;
    }
    public static void main(String[] args){
        Bai2 bai2 = new Bai2();

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần vào");
        int num = sc.nextInt();
           for(int i = 2 ; i < num;i++){
               if(bai2.soNguyenTo(i)){
                   System.out.print(i+"\n");
               }
           }
    }




}
