package codegym.com.baitap.abstractbaitap;

public class Chicken extends Animal implements Edible{
    @Override
    public String maleSould() {
        return "Chicken: ò ò ó ò";
    }

    @Override
    public String howtoEat() {
        return "Chick eat : gạo gạo ";
    }
}
