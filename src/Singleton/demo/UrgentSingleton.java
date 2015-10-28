package Singleton.demo;

/**
 * ����ģʽ
 * 
 * @˫�ؼ��
 */
public class UrgentSingleton {

	private static UrgentSingleton uniqueMyObject = new UrgentSingleton();

	private UrgentSingleton() {
	}

	public static UrgentSingleton getInstance() {
		return uniqueMyObject;
	}

}
