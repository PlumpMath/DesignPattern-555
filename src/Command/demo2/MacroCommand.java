package Command.demo2;

import Command.demo1.Command;
import Command.demo1.NoCommand;

/**
 * ∫Í√¸¡Ó
 */
public class MacroCommand implements Command {

	Command[] commands;
	Command[] undoCommands;

	public MacroCommand(Command[] commands) {
		this.commands = commands;
		undoCommands = new NoCommand[commands.length];
	}

	@Override
	public void execute() {
		for (Command command : commands) {
			command.execute();
		}
		undoCommands = commands;
	}

	@Override
	public void undo() {
		for (Command command : undoCommands) {
			command.undo();
		}
	}
}
