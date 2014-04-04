package br.com.exemplo.rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class MuralServidor implements Mural {
	
	public static final String NOME = "Mural";
	
	public MuralServidor() {
		super();
	}

	@Override
	public void escrever(String msg) throws RemoteException {
		System.out.println( msg );
	}
	
	public static void main(String[] args) {
		
		try {
			Mural mural = new MuralServidor();
			Mural stub = (Mural) UnicastRemoteObject.exportObject(mural, 0);
			
			Registry registry = LocateRegistry.getRegistry();
			registry.rebind(NOME, stub);
			
			System.out.println("Mural up and running...");
			
		} catch (RemoteException e) {
			System.err.println("Mural deu bronca...");
			e.printStackTrace();
		}
		
		
	}

}
