package Singleton.demo;

/**
 * 单件模式
 * 
 * @双保险
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
