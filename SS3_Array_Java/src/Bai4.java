import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mangHaiChieu = new int[3][3];
        System.out.println("Nhập " +mangHaiChieu.length + "hàng và "+ mangHaiChieu[0].length+" Cột vào :" );
        // nhập mảng
        for (int row = 0 ; row < mangHaiChieu.length; row++){
            System.out.println("Cột "+(row+1));
            for (int column = 0 ; column < mangHaiChieu[row].length; column++){
                mangHaiChieu[row][column] = sc.nextInt();
            }
        }
        // xuất mảng
        for (int row = 0;  row < mangHaiChieu.length; row++){
            for (int column= 0 ; column < mangHaiChieu[row].length; column++){
                System.out.print(mangHaiChieu[row][column]+" ");
            }
            System.out.println();
        }

//      tìm ra số lớn nhất trong mảng.
        int max = mangHaiChieu[0][0];
        for (int row = 0; row < mangHaiChieu.length;row++){
            for (int column = 0 ; column < mangHaiChieu[0].length; column++){
                if(max < mangHaiChieu[row][column]){
                    max = mangHaiChieu[row][column];
                }
            }
        }
        System.out.print("Số lớn nhất trong mảng :"+ max);
    }

}
