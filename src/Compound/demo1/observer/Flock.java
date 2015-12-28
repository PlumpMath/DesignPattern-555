package Compound.demo1.observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 组合模式+迭代器模式
 */
public class Flock implements Quackable {
	Observable observable;
	ArrayList<Quackable> quackers = new ArrayList<Quackable>();

	public Flock() {
		Iterator<Quackable> iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable quacker = iterator.next();
			observable = new Observable(quacker);
		}
	}

	public void add(Quackable quacker) {
		quackers.add(quacker);
	}

	@Override
	public void quack() {
		Iterator<Quackable> iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable quacker = iterator.next();
			quacker.quack();
			notifyObservers();
		}
	}

	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}

}
