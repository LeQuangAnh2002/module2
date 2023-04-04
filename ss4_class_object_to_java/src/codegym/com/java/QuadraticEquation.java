package codegym.com.java;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double a,b,c;
        System.out.print("Nhập giá trị thứ nhất :");
        a =sc.nextDouble();
        System.out.print("Nhập giá trị thứ hai :");
        b =sc.nextDouble();
        System.out.print("Nhập giá trị thứ ba :");
        c =sc.nextDouble();

        double delta = Math.pow(b,2) - 4*a*c;


        if(delta < 0){
            System.out.println("Phương trình vô nghiệm!");
        }else if( delta == 0){
            double x1 = -b/(2*a);
            System.out.println("Phương trình có nghiệm kép x1="+x1);
        }else{
           double n1 = (-b - Math.sqrt(delta))/(2*a);
           double n2 = (-b + Math.sqrt(delta))/(2*a);
           System.out.println("Phương trình có 2 nghiệm x1= "+n1+" và x2= "+n2);
        }

    }

}
