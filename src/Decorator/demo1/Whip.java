package Decorator.demo1;

/**
 * ×ÛºÏ¿§·È
 */
public class Whip extends DecoratorCondiment {
	Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
		this.setSize(Beverage.CupSize.TALL);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		double cost = beverage.cost();

		if (getSize() == Beverage.CupSize.TALL) {
			cost += 1.30;
		} else if (getSize() == Beverage.CupSize.GRANDE) {
			cost += 2.15;
		} else if (getSize() == Beverage.CupSize.GRANDE) {
			cost += 3.20;
		}

		return cost;
	}
}
