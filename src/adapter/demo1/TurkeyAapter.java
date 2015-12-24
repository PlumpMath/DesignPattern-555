package adapter.demo1;

/**
 * ��ð��Ѽ�ӵ�������
 * 
 * @����������
 */
public class TurkeyAapter implements Duck {
	Turkey turkey;

	public TurkeyAapter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		for (int i = 0; i < 5; i++) {
			turkey.fly();
		}
	}
}
