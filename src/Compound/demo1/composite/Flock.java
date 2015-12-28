package Compound.demo1.composite;

import java.util.ArrayList;
import java.util.Iterator;

import Compound.demo1.Quackable;

/**
 * 组合模式+迭代器模式
 */
public class Flock implements Quackable {
	ArrayList<Quackable> quackers = new ArrayList<Quackable>();

	public void add(Quackable quacker) {
		quackers.add(quacker);
	}

	@Override
	public void quack() {
		Iterator<Quackable> iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable quacker = iterator.next();
			quacker.quack();
		}
	}
}
