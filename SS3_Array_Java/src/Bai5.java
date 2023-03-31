import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int arrayListNumber[];
        do {
            System.out.println("Nhập kích thước mảng ");
            size = sc.nextInt();
            if( size > 20){
                System.out.println("Kích thước lớn hơn cho phép ");
            }
        }while (size > 20);
        arrayListNumber = new  int[size];

//        Nhập mảng

        for ( int i = 0 ; i < arrayListNumber.length; i++){
            System.out.printf("Nhập arrayListNumber[%d] = ", i);
            arrayListNumber[i] = sc.nextInt();
        }
        // xuất mảng
        for (int i = 0; i < arrayListNumber.length; i++){
            System.out.printf("arrayListNumber[%d] = %d\n",i , arrayListNumber[i]);
        }
        //tìm giá trị nhỏ nhất
        int min = arrayListNumber[0];
        for (int j =0 ; j < arrayListNumber.length; j++){
            if( min > arrayListNumber[j]){
                min = arrayListNumber[j];

            }
        }
        System.out.print("Số bé nhất trong mảng : "+ min);
    }
}
