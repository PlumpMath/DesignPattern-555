package Factory.demo3;

import Factory.demo3.PizzaStore.Type;

/**
 * ���󹤳�ģʽ
 */
public class BuyPizza {
	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYPizzaStore();
		System.out.println(nyPizzaStore.createPizza(Type.cheese));
		System.out.println(nyPizzaStore.createPizza(Type.clam));

		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
		System.out.println(chicagoPizzaStore.createPizza(Type.cheese));
		System.out.println(chicagoPizzaStore.createPizza(Type.clam));
	}
}
