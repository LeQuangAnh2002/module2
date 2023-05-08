package codegym.com.baitap;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập kích thước mảng :");
        int size = sc.nextInt();
        int[] list = new int[size];
        System.out.println("Nhập "+ list.length+" giá trị :");
        for (int i = 0; i < list.length; i++){
            list[i] = sc.nextInt();
        }
        System.out.println("Mảng nhập vào :");
        for (int i = 0 ; i < list.length ; i++){
            System.out.print(list[i] + "\t");
        }
        System.out.println("\n Đã sắp xếp");
        insertionSort(list);
        for (int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");}
    }
    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = x;
        }
    }
}
