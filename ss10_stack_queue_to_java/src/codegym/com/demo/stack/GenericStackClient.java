package codegym.com.demo.stack;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class GenericStackClient {
    public static  void stackOfInteger(){
        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();
        System.out.println("Nhập kích thước mảng ");
        int str = sc.nextInt();
        int[] arr = new int[str];
        System.out.println("Nhập giá trị vào mảng");
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
            stack.push(arr[i]);
        }
        System.out.println("Mảng ban đầu");
        for (Integer before: arr){
            System.out.println(before+"");
        }

        for (int j = 0; j < arr.length; j++){
            arr[j] = stack.pop();
        }
        System.out.println("Mảng sau khi đảo ngược");
        for (Integer after: arr){
            System.out.println(after+"");
        }


    }

    public static void main(String[] args) {
        stackOfInteger();
    }
}
