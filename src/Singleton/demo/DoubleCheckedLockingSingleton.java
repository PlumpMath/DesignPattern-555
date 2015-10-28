package Singleton.demo;

/**
 * 这不是一个好的单件模式，在多线程中会出现问题。
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
