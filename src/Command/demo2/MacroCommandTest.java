package Command.demo2;

import Command.demo1.CeilingFan;
import Command.demo1.CeilingFanLowCommand;
import Command.demo1.CeilingFanOffCommand;
import Command.demo1.Command;
import Command.demo1.GarageDoor;
import Command.demo1.GarageDoorDownCommand;
import Command.demo1.GarageDoorUpCommand;
import Command.demo1.Light;
import Command.demo1.LightOffCommand;
import Command.demo1.LightOnCommand;
import Command.demo1.SimpleRemoteControl;

/**
 * ∫Í√¸¡Ó π”√
 */
public class MacroCommandTest {
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
		CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(
				ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(
				ceilingFan);

		Command[] partyOn = { lightOn, garageDoorUp, ceilingFanLow };
		Command[] partyOff = { lightOff, garageDoorDown, ceilingFanOff };

		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);

		remote.setCommand(0, partyOnMacro, partyOffMacro);
		System.out.println(remote);
		System.out.println("------ Pushing Macro On ------");
		remote.onButtonWasPushed(0);
		System.out.println("------ Pushing Macro Off ------");
		remote.offButtonWasPushed(0);

	}
}
