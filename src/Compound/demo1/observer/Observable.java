package Compound.demo1.observer;

import java.util.ArrayList;
import java.util.Iterator;

public class Observable implements QuackObservable {
	ArrayList<Observer> observers = new ArrayList<Observer>();
	QuackObservable duck;

	public Observable(QuackObservable duck) {
		this.duck = duck;
	}

	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public void notifyObservers() {
		Iterator<Observer> it = observers.iterator();

		while (it.hasNext()) {
			Observer observer = it.next();
			observer.update(duck);
		}

	}

}
