package codegym.com.demo;

public class Demo1NoiBot {
    static  int[] list = {2,3,2,5,6,1,-2,3,14,12};

    public static void bubbleSort(int[] array){
        for (int i = 0 ; i< array.length; i++){
            for (int j = array.length-1; j > i; j--){
                if(array[j] < array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0 ; i < list.length; i++){
            System.out.print(list[i]+"\t");
        }
    }
}
