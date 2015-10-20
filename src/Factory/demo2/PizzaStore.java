package Factory.demo2;

/**
 * �ͻ��Ŀ��
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
