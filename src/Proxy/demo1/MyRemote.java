package Proxy.demo1;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Ô¶³Ì½Ó¿Ú
 */
public interface MyRemote extends Remote {
	public String sayHello() throws RemoteException;
}
