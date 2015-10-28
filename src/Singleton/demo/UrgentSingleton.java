package Singleton.demo;

/**
 * 单件模式
 * 
 * @双重检查
 */
public class UrgentSingleton {

	private static UrgentSingleton uniqueMyObject = new UrgentSingleton();

	private UrgentSingleton() {
	}

	public static UrgentSingleton getInstance() {
		return uniqueMyObject;
	}

}
