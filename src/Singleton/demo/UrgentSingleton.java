package Singleton.demo;

/**
 * 单件模式
 */
public class UrgentSingleton {

	private static UrgentSingleton uniqueMyObject = new UrgentSingleton();

	private UrgentSingleton() {
	}

	public static UrgentSingleton getInstance() {
		return uniqueMyObject;
	}

}
