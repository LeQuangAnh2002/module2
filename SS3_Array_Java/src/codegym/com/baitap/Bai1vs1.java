package codegym.com.baitap;

import java.util.Scanner;

public class Bai1vs1 {
    public static int timViTriCanTim(int[] list, int phanTu){
        int viTri = -1;
        for (int i = 0 ; i < list.length; i++){
            if(phanTu == viTri){
                System.out.println(phanTu +" Không tồn tại trong mảng ");
            }else{
                if (phanTu == list[i]){
                    viTri = i;
                }
            }
        }
        return viTri;
    }
    public static int[] xoaPhanTu(int[] daySo, int viTri){
            int[] daySoMoi = new int[daySo.length-1];
            for (int i = 0 ; i < viTri ; i++){
                daySoMoi[i] = daySo[i];
            }
            for (int j = viTri+1; j < daySo.length; j++){
                daySoMoi[j-1] = daySo[j];
            }
            return daySoMoi;
    }
    public static void main(String[] args) {
        int size ;
        int[] array;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a size :");
            size = sc.nextInt();
            if(size > 10){
                System.out.println("Size mảng không được lớn hơn 10 ");

            }
        }while (size > 10);

        array = new int[size];

        int i = 0 ;
        while (i < array.length){
            System.out.println("Nhập value vào mảng "+(i+1) +" :");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.println("Danh sách mảng sau khi nhập :");
        for (int j = 0 ; j < array.length; j++){
            System.out.print(array[j]+ "\t");
        }
        System.out.println("");
        System.out.println("Nhâp phần tử cần xóa :");
        int soCanTim = sc.nextInt();
        int valueDelete = timViTriCanTim(array,soCanTim);
        if (valueDelete == -1){
            System.out.println("Ko tồn tại trong mảng ");
        }else{
            array = xoaPhanTu(array,valueDelete);
            System.out.println("Danh sách sau khi xóa phần tử :");
            for (int j = 0 ; j < array.length; j++){
                System.out.print(array[j]+" ");
            }
        }



    }
}
