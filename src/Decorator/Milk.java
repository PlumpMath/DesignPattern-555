package Decorator;

/**
 * ×ÛºÏ¿§·È
 */
public class Milk extends DecoratorCondiment {
	Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
		this.setSize(Beverage.CupSize.TALL);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	@Override
	public double cost() {
		double cost = beverage.cost();

		if (getSize() == Beverage.CupSize.TALL) {
			cost += 0.10;
		} else if (getSize() == Beverage.CupSize.GRANDE) {
			cost += .35;
		} else if (getSize() == Beverage.CupSize.GRANDE) {
			cost += .80;
		}

		return cost;
	}
}
