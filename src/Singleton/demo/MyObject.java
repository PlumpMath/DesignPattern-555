package Singleton.demo;

/**
 * �ⲻ��һ���õĵ���ģʽ���ڶ��߳��л�������⡣
 */
public class MyObject {

	private static MyObject uniqueMyObject;

	private MyObject() {
	}

	public static MyObject getInstance() {
		if (uniqueMyObject == null) {
			uniqueMyObject = new MyObject();
		}
		return uniqueMyObject;
	}

}
