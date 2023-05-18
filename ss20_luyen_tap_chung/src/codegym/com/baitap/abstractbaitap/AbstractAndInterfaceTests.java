package codegym.com.baitap.abstractbaitap;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for(Animal animal: animals){
           System.out.println( animal.maleSould());
           if (animal instanceof  Chicken){
               Edible edible = (Chicken) animal; // ép kiểu Animal về kiểu Chicken
               System.out.println(edible.howtoEat());
           }
        }
    }

}
