package Command.demo1;

/**
 * 空对象
 * 
 * @说明：当你不想返回一个有意义的对象时，空对象就很有用。客户也可以将处理null的责任转移给空对象。在许多设计模式中，都会看到空对象的使用。甚至有些时候，空对象本身也被视为是一种设计模式。
 */
public class NoCommand implements Command {

	@Override
	public void execute() {

	}

	@Override
	public void undo() {

	}

}
