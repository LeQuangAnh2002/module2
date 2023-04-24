package codegym.com.baitap;

import java.util.Scanner;
import java.util.Stack;

public class Bai4 {
    public static void main(String[] args) {
            Stack<Character> stackChuoi = new Stack<Character>();
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập vào 1 chuỗi ");
            String xau = sc.nextLine();


        for (int i = 0 ; i < xau.length(); i++){
            char check = xau.charAt(i);

            if (check == '('){
                stackChuoi.push(check);
            }else if(check ==')'){
                if(stackChuoi.isEmpty()){
                    System.out.println("Ko hợp lệ");
                    return ;
                }else{
                stackChuoi.pop();
            }
            }
        }
        if(stackChuoi.isEmpty()){
            System.out.println("Hợp lệ");
        }else{
            System.out.println("Ko hợp lệ");
        }
    }


}
