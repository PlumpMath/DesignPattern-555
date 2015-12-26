package Proxy.demo1;

public class GumballMachine {
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;

	State state = soldOutState;
	int count = 0;

	String location;// ¼àÊÓÎ»ÖÃ

	public GumballMachine(int numberGumballs, String location) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		this.count = numberGumballs;
		if (count > 0) {
			state = noQuarterState;
		}

		this.location = location;
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

	public String getLocation() {
		return location;
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

	public State getWinnerState() {
		return winnerState;
	}

	public void insertQuarter() {
		state.insertQuarter();
	}

	public void refill(int count) {
		this.count = count;
		state = noQuarterState;
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

	public void setLocation(String location) {
		this.location = location;
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

	public void setWinnerState(State winnerState) {
		this.winnerState = winnerState;
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
}
