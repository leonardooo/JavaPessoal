package br.com.exemplo.rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MuralCliente {

	public static void main(String[] args) {
		
		String host = args[0];
		StringBuilder msg = new StringBuilder();
		for(int i = 1; i < args.length; i++) {
			msg.append(args[i] + " ");
		}
		
		try {
			Registry registry = LocateRegistry.getRegistry(host);
			
			Mural mural = (Mural) registry.lookup( MuralServidor.NOME );
			mural.escrever(msg.toString());
			
			System.out.println("MSG enviada...");
			
		} catch (RemoteException e) {
			System.err.println("Ihh, deu bronca: " + e.getMessage());
			e.printStackTrace();
		} catch (NotBoundException e) {
			System.err.println("Ihh, deu bronca: " + e.getMessage());
			e.printStackTrace();
		}
		
	}

}
