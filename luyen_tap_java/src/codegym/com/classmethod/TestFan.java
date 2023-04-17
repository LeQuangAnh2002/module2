package codegym.com.classmethod;

public class TestFan {
    public static void main(String[] args) {
        Fan fans = new Fan();
        System.out.println(fans);
        fans = new Fan(100,true,10,"yellow");
        System.out.println(fans);
    }
}
