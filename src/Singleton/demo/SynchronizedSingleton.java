package Singleton.demo;

/**
 * ����ģʽ
 * 
 * @���⣺ͬ�����Խ�����߳��г��ֵ�����
 * @ȱ�㣺ͬ��һ������������ɳ���ִ��Ч���½�100��
 */
public class SynchronizedSingleton {

	private static SynchronizedSingleton uniqueMyObject;

	private SynchronizedSingleton() {
	}

	public static synchronized SynchronizedSingleton getInstance() {
		if (uniqueMyObject == null) {
			uniqueMyObject = new SynchronizedSingleton();
		}
		return uniqueMyObject;
	}

}
