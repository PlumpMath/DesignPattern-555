package Singleton.demo;

/**
 * ����ģʽ
 * 
 * @˫����
 */
public class DoubleCheckedLockingSingleton {

	private volatile static DoubleCheckedLockingSingleton uniqueMyObject;

	private DoubleCheckedLockingSingleton() {
	}

	public static synchronized DoubleCheckedLockingSingleton getInstance() {
		if (uniqueMyObject == null) {
			synchronized (DoubleCheckedLockingSingleton.class) {
				if (uniqueMyObject == null) {
					uniqueMyObject = new DoubleCheckedLockingSingleton();
				}
			}
		}
		return uniqueMyObject;
	}

}
