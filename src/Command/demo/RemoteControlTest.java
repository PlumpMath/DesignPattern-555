package Command.demo;

/**
 * ≤‚ ‘
 */
public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();

		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);

		GarageDoor garageDoor = new GarageDoor();
		GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(
				garageDoor);

		remote.setCommand(0, lightOn, lightOff);
		remote.setCommand(1, garageDoorUp, garageDoorDown);

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
	}
}
