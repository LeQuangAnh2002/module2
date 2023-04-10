package codegym.com.demo1;

import codegym.com.demo1.Animal.Animal;
import codegym.com.demo1.Animal.Chicken;
import codegym.com.demo1.Animal.Tiger;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal: animals){
            System.out.println(animal.maleSould());
            if(animal instanceof Chicken){
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
        }


        }



    }
    }
