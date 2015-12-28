package Compound.demo1.observer;

public class Quackologist implements Observer, Quackable {

	@Override
	public void update(QuackObservable duck) {
		System.out.println("Quackologist: " + duck + " just quacked.");
	}

	@Override
	public void quack() {

	}

}
