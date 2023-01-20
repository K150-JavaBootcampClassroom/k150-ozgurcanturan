import Entity.Fruits;

public interface IFruitSaleStrategy {
void fruitSales(Fruits fruits);

void add(Fruits fruits, double kg);
void sell(Fruits fruits,double kg);
}
