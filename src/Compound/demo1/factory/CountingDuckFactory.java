package Compound.demo1.factory;

import Compound.demo1.DuckCall;
import Compound.demo1.MallardDuck;
import Compound.demo1.QuackCounter;
import Compound.demo1.Quackable;
import Compound.demo1.RedheadDuck;
import Compound.demo1.RubberDuck;

public class CountingDuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallarDuck() {
		return new QuackCounter(new MallardDuck());
	}

	@Override
	public Quackable createRedheadDuck() {
		return new QuackCounter(new RedheadDuck());
	}

	@Override
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}

	@Override
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}

}
