package Decorator.demo1;

/**
 * �ۺϿ���
 */
public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "House Blend Coffee";
	}

	@Override
	public double cost() {
		return .89;
	}
}
