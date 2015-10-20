package Factory.demo2;

/**
 * 工厂模式
 */
public class BuyPizza {
	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYStylePizzaStore();
		nyPizzaStore.orderPizza("cheese");

		PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();
		chicagoPizzaStore.orderPizza("clam");

	}
}
