package Proxy.demo1;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Զ�̽ӿ�
 */
public interface MyRemote extends Remote {
	public String sayHello() throws RemoteException;
}
