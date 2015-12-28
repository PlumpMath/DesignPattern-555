package Compound.demo1.factory;

import Compound.demo1.DuckCall;
import Compound.demo1.MallardDuck;
import Compound.demo1.Quackable;
import Compound.demo1.RedheadDuck;
import Compound.demo1.RubberDuck;

/**
 * 没有装饰者的工厂
 */
public class DuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallarDuck() {
		return new MallardDuck();
	}

	@Override
	public Quackable createRedheadDuck() {
		return new RedheadDuck();
	}

	@Override
	public Quackable createDuckCall() {
		return new DuckCall();
	}

	@Override
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}

}
