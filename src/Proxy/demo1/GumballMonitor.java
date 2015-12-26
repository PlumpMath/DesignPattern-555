package Proxy.demo1;

/**
 * ÌÇ¹û¼àÊÓÆ÷
 */
public class GumballMonitor {

	GumballMachine machine;

	public GumballMonitor(GumballMachine machine) {
		this.machine = machine;
	}

	public void report() {
		System.out.println("Glumball Machine: " + machine.getLocation());
		System.out.println("Current inventory: " + machine.getCount()
				+ " gumballs");
		System.out.println("Current state: " + machine.getState());
	}

}
