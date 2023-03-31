import java.util.Scanner;

public class ThucHanh4 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        System.out.println("-------------MENU---------------");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter fahrenheit: ");
                fahrenheit =sc.nextDouble();
                System.out.println("Fahrenheit to Celsius: "+doC(fahrenheit));
                break;
            case 2:
                System.out.println("Enter Celsius: ");
                celsius =sc.nextDouble();
                System.out.println("Fahrenheit to Celsius: "+doF(celsius));
                break;
            case 3:
                break;
        }

    }

    public static double doC(double celsius){
        double fahrenheit = (9.0 / 5) * celsius+ 32;
        return fahrenheit;
    }
    public static double doF(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit- 32);
        return celsius;
    }

}
