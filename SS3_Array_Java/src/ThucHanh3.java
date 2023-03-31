import java.util.Scanner;

public class ThucHanh3 {
    public static void main(String[] args){
            int size ;
            int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = sc.nextInt();
            if(size > 20){
                System.out.println("Size should not exceed 20");

            }
        }while (size > 20);
//        Nhập giá trị cho các phần tử của mảng
        array =new int[size];
        int i =0;
        while (i < array.length){
            System.out.print("Nhập phần tử "+(i+1)+ " :");
            array[i] = sc.nextInt();
            i++;
        }
//        In ra danh sách tài sản đã nhập
        System.out.print("Property list :");
        for (int j = 0; j < array.length;j++){
            System.out.print(array[j]+"\t");
        }
//       Duyệt các phần tử trong mảng để tìm GTLN và vị trí
        int max = array[0];
        int index =1 ;
        for (int j = 0; j < array.length;j++){
            if (max < array[j]){
                max = array[j];
                index= j+1;
            }
        }
        System.out.println("\n"+"Gía trị lớn nhất "+ max + " nằm tại vị trí "+index);
    }
}
