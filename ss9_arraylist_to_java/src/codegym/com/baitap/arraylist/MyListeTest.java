package codegym.com.baitap.arraylist;

public class MyListeTest extends MyList{
    public static void main(String[] args) {
        MyListImplements list = new  MyList();

        list.add(2);  //0
        list.add(4);  //1
        list.add(3);  //2
        list.add(5);  //3
        list.add(6);  //4
        list.add(7);  //5
        list.add(8);  //6
        list.add(9);  //7
        list.add(10); //8
        list.add(11); //9

        System.out.println("index(1) có giá trị " + list.get(0));
        System.out.println("index(2) có giá trị " + list.get(1));
        System.out.println("index(3) có giá trị " + list.get(2));
        System.out.println("index(4) có giá trị " + list.get(3));
        System.out.println("-----------------//----------------");

        System.out.println(" Danh sách mảng :");

        for (int index = 0 ; index < list.size(); index++){

             System.out.print(list.get(index) + "\n");
        }
        System.out.println("Kích thước mảng : "+list.size());
        System.out.println("-----------------//----------------");
        int number = 9;
        System.out.println("Truyền 1 giá trị bất kì :" + number);
        System.out.println( "Gía trị "+list.indexOf(number)+ "nằm tại vị trí "+ number);
        System.out.println("-----------------//----------------");
        System.out.println("Xóa phần tử :");
        System.out.println(list.remove(2));
                System.out.println(" Danh sách mảng sau khi xóa :");
        for (int index = 0 ; index < list.size(); index++){
             System.out.print(list.get(index) + "\n");
        }
        System.out.println("-----------------//----------------");
        list.clear(); //reset toàn bộ mảng về 0
















    }
}
