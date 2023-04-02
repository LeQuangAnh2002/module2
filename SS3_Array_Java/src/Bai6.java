import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cột bạn muốn tính tổng");
        int col = sc.nextInt();

        findSum(col);

    }
    public  static void findSum(int column){
        int sum = 0;
        int[][] array = {
                {1, 8, 2},
                {3, 5, 4},
                {6, 7, 2}
        };
        for (int i = 0; i < array.length;i++){
            for (int j = 0 ; j < array[i].length;j++){
                if( i == column){
                    sum = sum+ array[i][j];
                }
            }
        }

        System.out.println("Tổng "+ sum);
    }





}
