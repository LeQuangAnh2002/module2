package codegym.com.demo1.Animal;

import codegym.com.demo1.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String maleSould() {
        return "chicken: ò ò o o ó";
    }

    @Override
    public String howToEat() {
        return "Could be fried";
    }
}
