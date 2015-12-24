package adapter.demo1;

import javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon;

public class TestDrive {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		Turkey duckAdapter = new DuckAapter(duck);

		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAapter(turkey);

		System.out.println("The Turkey says...");
		testTurkey(turkey);

		System.out.println("\nThe DuckAdapter says...");
		testTurkey(duckAdapter);

		System.out.println("\nThe Duck says...");
		testDuck(duck);

		System.out.println("\nThe TurkeyAdapter syas...");
		testDuck(turkeyAdapter);

	}

	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}

	static void testTurkey(Turkey turkey) {
		turkey.gobble();
		turkey.fly();
	}
}
