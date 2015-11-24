package Command.demo1;

/**
 * ≤‚ ‘
 */
public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl(5);

		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);

		GarageDoor garageDoor = new GarageDoor();
		GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(
				garageDoor);

		CeilingFan ceilingFan = new CeilingFan("Living Room");
		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(
				ceilingFan);
		CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(
				ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(
				ceilingFan);

		remote.setCommand(0, lightOn, lightOff);
		remote.setCommand(1, garageDoorUp, garageDoorDown);
		remote.setCommand(2, ceilingFanLow, ceilingFanOff);
		remote.setCommand(3, ceilingFanHigh, ceilingFanOff);

		remote.onButtonWasPushed(0);
		remote.offButtonWasPushed(0);
		System.out.println(remote);
		remote.undoButtonWasPushed();
		remote.offButtonWasPushed(0);
		remote.onButtonWasPushed(0);
		System.out.println(remote);
		remote.undoButtonWasPushed();
		remote.onButtonWasPushed(1);
		remote.offButtonWasPushed(1);
		System.out.println(remote);
		
		remote.onButtonWasPushed(2);
		remote.offButtonWasPushed(2);
		System.out.println(remote);
		remote.undoButtonWasPushed();
		
		remote.onButtonWasPushed(3);
		System.out.println(remote);
		remote.undoButtonWasPushed();
	}
}
