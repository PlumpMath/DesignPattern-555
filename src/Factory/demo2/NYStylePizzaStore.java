package Factory.demo2;

public class NYStylePizzaStore extends PizzaStore {

	public Pizza createPizza(String type) {

		Pizza pizza = null;

		if ("cheese".equals(type)) {
			pizza = new NYStyleCheesePizza();
		} else if ("pepperoni".equals(type)) {
			pizza = new NYStylePepperoniPizza();
		} else if ("clam".equals(type)) {
			pizza = new NYStyleClamPizza();
		} else if ("veggie".equals(type)) {
			pizza = new NYStyleVeggiePizza();
		}
		return pizza;
	}
}
