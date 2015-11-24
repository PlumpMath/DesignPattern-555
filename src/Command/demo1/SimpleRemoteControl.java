package Command.demo1;

/**
 * ¼òµ¥µÄÔ¶³ÌÒ£¿ØÆ÷
 */
public class SimpleRemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;

	public SimpleRemoteControl(int size) {
		onCommands = new Command[size];
		offCommands = new Command[size];

		Command noCommand = new NoCommand();

		for (int i = 0; i < size; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}

		undoCommand = noCommand;
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}

	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}

	public void undoButtonWasPushed() {
		undoCommand.undo();
	}

	@Override
	public String toString() {

		StringBuffer str = new StringBuffer();

		str.append("\n------ Remote Control ------ \n");
		for (int i = 0; i < offCommands.length; i++) {
			str.append("[slot" + i + "] " + onCommands[i].getClass().getName()
					+ "    " + offCommands[i].getClass().getName() + "\n");
		}

		str.append("[undo] " + undoCommand.getClass().getName() + "\n");

		return str.toString();
	}
}
