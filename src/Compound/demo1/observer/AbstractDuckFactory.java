package Compound.demo1.observer;

/**
 * 抽象工厂模式
 */
public abstract class AbstractDuckFactory {
	public abstract Quackable createMallarDuck();

	public abstract Quackable createRedheadDuck();

	public abstract Quackable createDuckCall();

	public abstract Quackable createRubberDuck();
}
