package Factory.demo2;

public class NYStylePizzaStore extends PizzaStore {

	public Pizza createPizza(Type type) {

		Pizza pizza = null;

		if (Type.cheese.equals(type)) {
			pizza = new NYStyleCheesePizza();
		} else if (Type.pepperoni.equals(type)) {
			pizza = new NYStylePepperoniPizza();
		} else if (Type.clam.equals(type)) {
			pizza = new NYStyleClamPizza();
		} else if (Type.veggie.equals(type)) {
			pizza = new NYStyleVeggiePizza();
		}
		return pizza;
	}

}
