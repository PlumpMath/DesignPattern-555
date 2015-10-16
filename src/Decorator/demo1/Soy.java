package Decorator.demo1;

/**
 * ×ÛºÏ¿§·È
 */
public class Soy extends DecoratorCondiment {
	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
		this.setSize(Beverage.CupSize.TALL);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		double cost = beverage.cost();

		if (getSize() == Beverage.CupSize.TALL) {
			cost += 0.80;
		} else if (getSize() == Beverage.CupSize.GRANDE) {
			cost += .95;
		} else if (getSize() == Beverage.CupSize.GRANDE) {
			cost += 1.20;
		}

		return cost;
	}
}
