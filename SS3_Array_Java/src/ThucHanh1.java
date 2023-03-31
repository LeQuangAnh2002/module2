import java.util.Scanner;

public class ThucHanh1 {
    public static void main(String[] args){
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if(size > 20){
                System.out.println("Size does not exceed 20");
            }
        }while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("Enter element"+(i+1)+" : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s","Element is array : ","");
        for (int h = 0 ; h < array.length;h++){
            System.out.print(array[h]+"\t");
        }
        System.out.printf("%-20s%s","Element in array :","");
        for (int j = 0 ; j < array.length/2;j++){
            int temp = array[j];
            array[j] = array[size - 1  - j];
            array[size-1-j] = temp;
        }
        System.out.printf("%-20s%s","Reverse array : ","");
        for (int n = 0 ; n < array.length;n++){
            System.out.print(array[n]+"\t");
        }
    }
}
