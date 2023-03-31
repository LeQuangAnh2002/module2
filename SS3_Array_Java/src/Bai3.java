import java.util.Arrays;
import java.util.Scanner;

public class Bai3

{
    public static void main(String[] args) {
        int array1[] = {1, 2, 3};
        int array2[] = {4, 5, 6};
        int lengthC = array1.length + array2.length;

        int array3[] = new int[lengthC];
        int plus = 0;
        for (int i = 0; i < array1.length; i++){
            array3[plus] = array1[i];
            plus++;
        }
        for (int j = 0 ; j < array2.length;j++){
            array3[plus] = array2[j];
            plus++;
        }
        System.out.print(Arrays.toString(array3));
    }
}
