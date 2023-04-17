package codegym.com.abstractclass;

public class Chicken extends Animal implements Edible{

    @Override
    public String makeSound() {
        return "checken: o o o o o ";
    }

    @Override
    public String howtoEat() {
        return "Could be fried";
    }
}
