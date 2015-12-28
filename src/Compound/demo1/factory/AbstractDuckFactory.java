package Compound.demo1.factory;

import Compound.demo1.Quackable;

/**
 * ���󹤳�ģʽ
 */
public abstract class AbstractDuckFactory {
	public abstract Quackable createMallarDuck();

	public abstract Quackable createRedheadDuck();

	public abstract Quackable createDuckCall();

	public abstract Quackable createRubberDuck();
}
