package codegym.com.baitap;

import java.util.LinkedList;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        //tìm chuỗi tăng dần có độ dài lớn nhất
        for(int i = 0 ; i < string.length(); i++){
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));

            for (int j = i + 1; j < string.length(); j++ ){
                if (string.charAt(j) > list.getLast()){
                    list.add(string.charAt(j));
                }
            }
            if(list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character ch: max){
            System.out.println(ch);
        }
        System.out.println();
    }
}
