package codegym.com.thuchanh;

public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1); // 0
        listInteger.add(2); // 1
        listInteger.add(3); // 2
        listInteger.add(4); // 3
        listInteger.add(6); // 4
        listInteger.add(7); // 5
        listInteger.add(8); // 6
        listInteger.add(9); // 7
        listInteger.add(10);// 8
        listInteger.add(11);// 9
        listInteger.add(12);// 10
        listInteger.add(13);//11
        listInteger.add(14);//12
        listInteger.add(15);//13
        listInteger.add(16);//14
        listInteger.add(17);//15
        listInteger.add(18);//16
        listInteger.add(19);//17


        System.out.println("element 4: "+listInteger.get(4));
        System.out.println("element 1: "+listInteger.get(1));
        System.out.println("element 2: "+listInteger.get(2));


       System.out.println("element 5: "+ listInteger.get(3));
       System.out.println("element 17: "+ listInteger.get(17));

    }
}
