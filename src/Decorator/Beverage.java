package Decorator;

/**
 *
 */
public abstract class Beverage {

	public enum CupSize {
		TALL, GRANDE, VENTI;
	}

	String description = "Unknown Beverage";
	private CupSize size;

	public CupSize getSize() {
		return size;
	}

	public void setSize(CupSize size) {
		this.size = size;
	}

	public String getDescription() {
		return description;
	}

	public abstract double cost();

}
