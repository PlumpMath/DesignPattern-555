package Decorator;

/**
 * ×ÛºÏ¿§·È
 */
public class Soy extends DecoratorCondiment {
	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return .80 + beverage.cost();
	}
}
