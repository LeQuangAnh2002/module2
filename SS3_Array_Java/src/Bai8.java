import java.util.Scanner;

public class Bai8
{

    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn hãy nội dung cho chuỗi :");
        s = sc.nextLine();
        System.out.println("Bạn hãy nhập ký tự :");
        char c ;
        c = sc.next().charAt(0);
        int count = 0;
        for (int i = 0 ; i < s.length(); i++){
            if (s.charAt(i) == c){
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của "+ c + " là :"+ count);
    }
}
