package Singleton.demo;

/**
 * ����ģʽ
 */
public class UrgentSingleton {

	private static UrgentSingleton uniqueMyObject = new UrgentSingleton();

	private UrgentSingleton() {
	}

	public static UrgentSingleton getInstance() {
		return uniqueMyObject;
	}

}
