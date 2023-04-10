package codegym.com.demo1.fruit;

import codegym.com.demo1.Edible;

public abstract class Fruit implements Edible {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();

//        for (int i = 0 ; i <= fruits.length; i++){
//            System.out.println(fruits.);
//        }
        for (Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }
    }

}
