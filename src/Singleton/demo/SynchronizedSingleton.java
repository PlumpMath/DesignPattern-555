package Singleton.demo;

/**
 * 单件模式
 * 
 * @问题：同步可以解决多线程中出现的问题
 * @缺点：同步一个方法可能造成程序执行效率下降100倍
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
