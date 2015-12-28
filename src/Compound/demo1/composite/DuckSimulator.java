package Compound.demo1.composite;

import Compound.demo1.Goose;
import Compound.demo1.GooseAdapter;
import Compound.demo1.QuackCounter;
import Compound.demo1.Quackable;
import Compound.demo1.factory.AbstractDuckFactory;
import Compound.demo1.factory.CountingDuckFactory;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		simulator.simulate(duckFactory);
	}

	void simulate(AbstractDuckFactory duckFactory) {
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());

		System.out.println("\nDuck Simulator: With Composite - FLocks");

		Flock flockOfDucks = new Flock();

		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);

		Flock flockOfMallards = new Flock();

		Quackable mallard1 = duckFactory.createMallarDuck();
		Quackable mallard2 = duckFactory.createMallarDuck();
		Quackable mallard3 = duckFactory.createMallarDuck();
		Quackable mallard4 = duckFactory.createMallarDuck();

		flockOfMallards.add(mallard1);
		flockOfMallards.add(mallard2);
		flockOfMallards.add(mallard3);
		flockOfMallards.add(mallard4);

		flockOfDucks.add(flockOfMallards);

		System.out.println("\nDuck Simulator: Whole Flock Simulation");
		simulate(flockOfDucks);

		System.out.println("\nDuck Simulator: Mallard Flock Simulation");
		simulate(flockOfMallards);

		System.out.println("\nThe ducks quacked " + QuackCounter.getQuacks()
				+ " times");

	}

	void simulate(Quackable duck) {
		duck.quack();
	}
}
