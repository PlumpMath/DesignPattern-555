package Factory.demo2;

/**
 * ¿Í»§µÄ¿ò¼Ü
 */
public abstract class PizzaStore {

	Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	protected abstract Pizza createPizza(String type);

}
