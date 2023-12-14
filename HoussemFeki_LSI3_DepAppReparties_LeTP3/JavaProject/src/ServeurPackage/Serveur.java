package ServeurPackage;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import ThreadPackage.ClientProcess;

public class Serveur extends Thread{
	public static void main(String[] args){
		 // création d’un thread 
		 new Serveur().start() ; 
	}
	public void run() { 
		try {	
	       int nbrclient=1;
	       ServerSocket socketServeur;
		   socketServeur = new ServerSocket(1234);
	       System.out.println("Le serveur attend la connexion d'un client ");
	    while(true){
		   Socket socket;
	       socket = socketServeur.accept();
		   ClientProcess client = new ClientProcess(socket, nbrclient);
		   client.start();
		   new ClientProcess (socket, nbrclient).start();
		   nbrclient++;
	} }catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
}