package Factory.demo1;

/**
 * 简单工厂：其实不是一个设计模式，反而比较像是一种编程习惯
 */
public class SimplePizzaFactory {
	public Pizza createPizza(String type) {

		Pizza pizza = null;

		if ("cheese".equals(type)) {
			pizza = new CheesePizza();
		} else if ("pepperoni".equals(type)) {
			pizza = new PepperoniPizza();
		} else if ("clam".equals(type)) {
			pizza = new ClamPizza();
		} else if ("veggie".equals(type)) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
