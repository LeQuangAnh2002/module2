package codegym.com.baitap;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) throws IllegalTriangleException{
        Scanner sc = new Scanner(System.in);
        Triangle triangle = new Triangle();
        boolean done = false;
        double side1,side2,side3;
        System.out.print("Enter three side :");
        while (!done){
           try {
               side1 = sc.nextDouble();
               side2 = sc.nextDouble();
               side3 = sc.nextDouble();
               triangle = new Triangle(side1,side2,side3);
               done = true;
           }catch (IllegalTriangleException ex){
               System.out.println(ex.getMessage());
               System.out.print("Enter three sides:  ");
               sc.nextLine();
           }
        }




}
}
