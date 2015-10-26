package Factory.demo3;

/**
 * �ͻ��Ŀ��
 */
public abstract class PizzaStore {

	public enum Type {
		cheese, pepperoni, clam, veggie
	}

	Pizza orderPizza(Type type) {
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	protected abstract Pizza createPizza(Type type);

}
