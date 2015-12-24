package adapter.demo1;

/**
 * Ñ¼×ÓÃ°³ä»ğ¼¦µÄÊÊÅäÆ÷
 * 
 * @¶ÔÏóÊÊÅäÆ÷
 */
public class DuckAapter implements Turkey {
	Duck duck;

	public DuckAapter(Duck duck) {
		this.duck = duck;
	}

	@Override
	public void fly() {
		duck.fly();
	}

	@Override
	public void gobble() {
		for (int i = 0; i < 3; i++) {
			duck.quack();
		}
	}
}
