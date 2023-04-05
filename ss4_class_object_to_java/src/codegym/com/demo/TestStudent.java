package codegym.com.demo;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Tên "+ student.getName());
        System.out.println("Lớp " + student.getClasses());
    }
}
