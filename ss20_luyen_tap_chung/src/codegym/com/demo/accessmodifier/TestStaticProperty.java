package codegym.com.demo.accessmodifier;

import codegym.com.demo.accessmodifier.StaticProperty;

public class TestStaticProperty {
    public static void main(String[] args) {
        StaticProperty staticProperty1 = new StaticProperty("Mazda 3","Skyactiv 3");
        System.out.println(StaticProperty.numberOfCars);
        StaticProperty staticPropert2 = new StaticProperty("Mazda 6","Skyactiv 6");
        System.out.println(StaticProperty.numberOfCars);
    }
}
