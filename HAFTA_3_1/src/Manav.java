import Entity.Apple;
import Entity.Cherry;
import Entity.Fruits;
import Entity.Pear;

public class Manav {


    public static void main(String[] args) {
        FruitSaleManager fruitSaleManager = new FruitSaleManager();

        Fruits apple = new Apple("Elma", 50);
        Fruits pear = new Pear("Armut", 50);
        Fruits cherry = new Cherry("Kiraz", 50);

        fruitSaleManager.add(apple, 5);
        fruitSaleManager.add(pear, 0.01);
        fruitSaleManager.add(cherry, 45);

        fruitSaleManager.sell(apple, 54.9);
        fruitSaleManager.sell(pear, 50);
        fruitSaleManager.sell(cherry, 123);

    }
}