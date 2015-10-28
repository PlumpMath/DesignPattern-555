package Singleton.demo;

/**
 * �ⲻ��һ���õĵ���ģʽ���ڶ��߳��л�������⡣
 */
public class DoubleCheckedLockingSingleton {

	private volatile static DoubleCheckedLockingSingleton uniqueMyObject;

	private DoubleCheckedLockingSingleton() {
	}

	public static DoubleCheckedLockingSingleton getInstance() {
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
