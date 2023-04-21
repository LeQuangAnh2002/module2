package codegym.com.baitap;

import java.util.Formattable;
import java.util.Scanner;
import java.util.Stack;

public class Bai1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ThisIsMyStack stack = new ThisIsMyStack(5);

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("Danh sách mảng số nguyên Stack :");
        for (int i = 0; i < stack.size(); i++){
            System.out.print(stack.pop() + "\t");
        }
        System.out.println();
        System.out.println("------------------------||------------------");
        Stack<String> stackChuoi = new Stack<>();
        System.out.println("Nhập vào 1 chuỗi ");
        String s = sc.nextLine();
        for (int i = 0 ; i < s.length() ; i++){
            stackChuoi.push(s.charAt(i)+"");
        }

        System.out.println("Chuỗi đảo ngược ");
        for (int j = 0 ; j < s.length(); j++){
            System.out.print(stackChuoi.pop());
        }
    }
}
