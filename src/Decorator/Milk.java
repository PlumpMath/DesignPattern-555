package Decorator;

/**
 * ×ÛºÏ¿§·È
 */
public class Milk extends DecoratorCondiment {
	Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	@Override
	public double cost() {
		return .80 + beverage.cost();
	}
}
