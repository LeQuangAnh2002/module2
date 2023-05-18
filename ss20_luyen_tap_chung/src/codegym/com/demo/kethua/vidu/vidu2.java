package codegym.com.demo.kethua.vidu;

public class vidu2 {
    public static void main(String[] args) {
        C c = new C();
        c.p(10);
        c.p(10.0);
    }
}

    class C extends D {
        public void p(int number) {
            System.out.println(number);
        }
    }

    class D {
        public void p(double number) {
            System.out.println(number * 2);
        }
    }
