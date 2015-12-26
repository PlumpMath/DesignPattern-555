package State.demo2;

public class GumballMachine {
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;

	State state = soldOutState;
	int count = 0;

	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		this.count = numberGumballs;
		if (count > 0) {
			state = noQuarterState;
		}
	}

	public State getWinnerState() {
		return winnerState;
	}

	public void setWinnerState(State winnerState) {
		this.winnerState = winnerState;
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public int getCount() {
		return count;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getState() {
		return state;
	}

	public void insertQuarter() {
		state.insertQuarter();
	}

	public void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count--;
		}
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setHasQuarterState(State hasQuarterState) {
		this.hasQuarterState = hasQuarterState;
	}

	public void setNoQuarterState(State noQuarterState) {
		this.noQuarterState = noQuarterState;
	}

	public void setSoldOutState(State soldOutState) {
		this.soldOutState = soldOutState;
	}

	public void setSoldState(State soldState) {
		this.soldState = soldState;
	}

	public void setState(State state) {
		this.state = state;
	}

	@Override
	public String toString() {
		String str = "\nMighty Gumball, Inc.";
		str += "\nJava-enabled Standing Gumball Model #2015";
		str += "\nInventory: " + count + " gumballs";
		if (state == soldOutState) {
			str += "\nMachine is sold out";
		} else {
			str += "\nMachine is waiting for quarter";
		}
		str += "\n";
		return str;
	}

	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	public void refill(int count) {
		this.count = count;
		state = noQuarterState;
	}
}
