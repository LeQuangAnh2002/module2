package codegym.com.demo1.Animal;

import codegym.com.demo1.Edible;

public class Tiger extends Animal implements Edible {

    @Override
    public String maleSould() {
        return "Tiger: roarrrr!";
    }

    @Override
    public String howToEat() {
        return "Ngon ngon";
    }
}
