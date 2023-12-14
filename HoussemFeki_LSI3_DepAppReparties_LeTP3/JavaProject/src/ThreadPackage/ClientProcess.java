package ThreadPackage;

import java.io.IOException;
import java.net.Socket;

public class ClientProcess extends Thread {
 
	Socket socket;
	int numClient;
	public ClientProcess(Socket socket, int numClient){ 
	 super(); 
	 this.socket = socket; 
	 this.numClient=numClient;
	 } 
// le client effectue son traitement
	public void run() { 
	 System.out.println("Le client numéro "+ numClient + " est connecté !");

	try {
		socket.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 }
	}
