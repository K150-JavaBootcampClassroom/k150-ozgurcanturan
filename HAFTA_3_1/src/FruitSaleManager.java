import Entity.Fruits;

public class FruitSaleManager implements IFruitSaleStrategy {

    IFruitSaleStrategy iFruitSaleStrategy;

    @Override
    public void fruitSales(Fruits fruits) {
        iFruitSaleStrategy.fruitSales(fruits);
    }

    @Override
    public void add(Fruits fruits, double kg) {
        fruits.setKg(fruits.getKg() + kg);
        System.out.println("Depoya " + kg + "Kg " + fruits.getName() + " eklendi.");
    }

    @Override
    public void sell(Fruits fruits, double kg) {
        if (kg < fruits.getKg() & fruits.getKg() > 0) {
            fruits.setKg(fruits.getKg() - kg);
            System.out.println("Satış Gerçekleşti...");
            System.out.println("Kalan "+fruits.getName()+": "+fruits.getKg());
        } else {
            System.out.println("Yeterli Stok Yok");
        }
    }
}
