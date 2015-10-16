package Decorator.demo1;

/**
 * ×ÛºÏ¿§·È
 */
public class Mocha extends DecoratorCondiment {
	Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
		this.setSize(Beverage.CupSize.TALL);
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {

		double cost = beverage.cost();

		if (getSize() == Beverage.CupSize.TALL) {
			cost += 0.10;
		} else if (getSize() == Beverage.CupSize.GRANDE) {
			cost += .15;
		} else if (getSize() == Beverage.CupSize.GRANDE) {
			cost += .20;
		}

		return cost;
	}
}
