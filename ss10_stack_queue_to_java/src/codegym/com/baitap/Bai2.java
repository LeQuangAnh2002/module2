package codegym.com.baitap;

import java.util.Scanner;
import java.util.Stack;

public class Bai2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 số nguyên dương từ bàn phím : ");
        int number = sc.nextInt();
        while (number > 0){
            int soDu = number % 2;
            stack.push(soDu+"");
            number = number/2;
        }
         System.out.println("Số nhị phân là : ");
         int n = stack.size();
         for (int i = 0 ; i < n ; i++){
             System.out.print(stack.pop()+ "\t");
         }
    }
}
