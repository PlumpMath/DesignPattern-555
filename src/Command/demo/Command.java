package Command.demo;

/**
 * ����ģʽ-����ӿ�
 */
public interface Command {

	/**
	 * ִ������
	 */
	public void execute();

	/**
	 * ��������
	 */
	public void undo();

}
