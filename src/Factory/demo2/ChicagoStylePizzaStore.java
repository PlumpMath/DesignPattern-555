package Factory.demo2;

public class ChicagoStylePizzaStore extends PizzaStore {

	public Pizza createPizza(String type) {

		Pizza pizza = null;

		if ("cheese".equals(type)) {
			pizza = new ChicagoStyleCheesePizza();
		} else if ("pepperoni".equals(type)) {
			pizza = new ChicagoStylePepperoniPizza();
		} else if ("clam".equals(type)) {
			pizza = new ChicagoStyleClamPizza();
		} else if ("veggie".equals(type)) {
			pizza = new ChicagoStyleVeggiePizza();
		}
		return pizza;
	}
}
