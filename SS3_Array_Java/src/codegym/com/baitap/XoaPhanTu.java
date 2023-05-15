package codegym.com.baitap;

import java.awt.font.FontRenderContext;
import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size ;
        int[] array;
        int soCanTim;
        do {
            System.out.println("Enter a size :");
            size = sc.nextInt();
            if(size > 10){
                System.out.println("Size không được lớn hơn 10 phần tử!!!");
            }

        }while (size > 10);
        array = new int[size];
        int i = 0;
        System.out.println("Enter value vào mảng :");
        while (i < array.length){
            array[i] = sc.nextInt();
            i++;
        }
        System.out.println("Danh sách sau khi nhập vào :");
        for (int k =0 ; k < array.length; k++){
            System.out.print(array[k]+ "\t");
        }
        System.out.println("");
        System.out.print("Nhập số cần xóa : ");
        soCanTim = sc.nextInt();
        int deleteValue =  timKiemPhanTu(array,soCanTim);
        if(soCanTim == -1){
            System.out.println("Mảng không tồn tại phần tử "+ soCanTim);
        }else{

            array = xoaPhanTu(array,deleteValue);
            System.out.println("Danh sách sau khi xóa :");
            for (int j = 0; j < array.length; j++){
                System.out.print(array[j]+"\t");
            }

        }

    }

    public static int timKiemPhanTu(int[] list, int phanTu){
        int viTri = 0;
        for (int i = 0; i < list.length;i++){
            if (phanTu == list[i]){
                viTri = i;
            }
        }
        return viTri;
    }
    public static int[] xoaPhanTu(int[] listArray, int viTri){
        int[] newArray = new int[listArray.length-1];
        for (int i = 0; i < viTri; i++){
            newArray[i] = listArray[i];
        }
        for (int j = viTri+1 ; j < listArray.length; j++ ){
            newArray[j-1] = listArray[j];
        }
        return newArray;
    }
}
