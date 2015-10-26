package Factory.demo3;

/**
 * ����ģʽ
 */
public class BuyPizza {
	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYStylePizzaStore();
		nyPizzaStore.orderPizza(PizzaStore.Type.cheese);

		PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();
		chicagoPizzaStore.orderPizza(PizzaStore.Type.clam);

	}
}
