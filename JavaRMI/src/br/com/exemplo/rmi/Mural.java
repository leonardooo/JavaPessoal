package br.com.exemplo.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Mural extends Remote {
	
	void escrever(String msg) throws RemoteException;

}
