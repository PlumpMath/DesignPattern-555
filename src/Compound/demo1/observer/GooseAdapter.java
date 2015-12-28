package Compound.demo1.observer;

/**
 *   ≈‰∆˜ƒ£ Ω
 */
public class GooseAdapter implements Quackable {
	Goose goose;

	public GooseAdapter(Goose goose) {
		this.goose = goose;
	}

	@Override
	public void quack() {
		goose.honk();
	}

}
