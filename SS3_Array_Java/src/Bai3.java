import java.util.Arrays;
import java.util.Scanner;

public class Bai3

{
    public static void main(String[] args) {
        int Array1[] = {1, 2, 3};
        int Array2[] = {4, 5, 6};
        int lengthC = Array1.length + Array2.length;

        int Array3[] = new int[lengthC];
        int plus = 0;
        for (int i = 0; i < Array1.length; i++){
            Array3[plus] = Array1[i];
            plus++;
        }
        for (int j = 0 ; j < Array2.length;j++){
            Array3[plus] = Array2[j];
            plus++;
        }
        System.out.print(Arrays.toString(Array3));
    }
}
