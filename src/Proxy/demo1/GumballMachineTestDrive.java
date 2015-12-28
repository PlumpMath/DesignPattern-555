package Proxy.demo1;

/**
 * ´ýÐÞ¸Ä
 */
public class GumballMachineTestDrive {
	public static void main(String[] args) {
		int count = 100;
		String location = "Seattle";
		GumballMachine gumballMachine = new GumballMachine(count, location);
		GumballMonitor monitor = new GumballMonitor(gumballMachine);

		monitor.report();
	}
}
