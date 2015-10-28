package Singleton.demo;

/**
 * 这不是一个好的单件模式，在多线程中会出现问题。
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
