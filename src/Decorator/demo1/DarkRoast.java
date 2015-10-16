package Decorator.demo1;

/**
 * Å¨¿§·È
 */
public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "DarkRoast";
	}

	@Override
	public double cost() {
		return 3.99;
	}
}
