package Command.demo1;

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
