package Factory.demo3;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(Type type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

		if (Type.cheese == type) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		} else if (Type.clam == type) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
		} else if (Type.veggie == type) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");
		} else if (Type.pepperoni == type) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
		}

		return pizza;
	}

}
