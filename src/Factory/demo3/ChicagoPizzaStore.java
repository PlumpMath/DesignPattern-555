package Factory.demo3;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(Type type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

		if (Type.cheese == type) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");
		} else if (Type.clam == type) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");
		} else if (Type.veggie == type) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Veggie Pizza");
		} else if (Type.pepperoni == type) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Pepperoni Pizza");
		}

		return pizza;
	}

}
