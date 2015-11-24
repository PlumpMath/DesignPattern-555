package Command.demo1;

public class CeilingFanOffCommand implements Command {

	CeilingFan ceilingFan;
	int prevSpeed;// ×´Ì¬×·×Ù

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		this.prevSpeed = ceilingFan.speed;
		ceilingFan.off();
	}

	@Override
	public void undo() {
		if (prevSpeed == CeilingFan.HIGH) {
			ceilingFan.high();
		} else if (prevSpeed == CeilingFan.MEDIUM) {
			ceilingFan.medium();
		} else if (prevSpeed == CeilingFan.LOW) {
			ceilingFan.low();
		} else if (prevSpeed == CeilingFan.OFF) {
			ceilingFan.off();
		}
	}
}
