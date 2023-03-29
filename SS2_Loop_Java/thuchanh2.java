import java.util.Scanner;

public class thuchanh2 {
    public static void main(String[] args){
        double money = 0;
        int month = 1;
        double interset_rate = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền cần vay ");
        money = sc.nextDouble();
        System.out.println("Nhập số tháng cần vay ");
        month = sc.nextInt();
        System.out.println("Nhập lãi xuất ");
        interset_rate = sc.nextDouble();
        double total_interset = 0;
        for (int i = 0; i < month ; i++){
            total_interset = money * (interset_rate/100/12) *3 ;
        }
        System.out.println("Total of interset :"+ total_interset);
    }
}
