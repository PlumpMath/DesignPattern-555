package Factory.demo3;

public class ChicagoStylePizzaStore extends PizzaStore {

	public Pizza createPizza(Type type) {

		Pizza pizza = null;

		if (Type.cheese.equals(type)) {
			pizza = new ChicagoStyleCheesePizza();
		} else if (Type.pepperoni.equals(type)) {
			pizza = new ChicagoStylePepperoniPizza();
		} else if (Type.clam.equals(type)) {
			pizza = new ChicagoStyleClamPizza();
		} else if (Type.veggie.equals(type)) {
			pizza = new ChicagoStyleVeggiePizza();
		}
		return pizza;
	}
}
