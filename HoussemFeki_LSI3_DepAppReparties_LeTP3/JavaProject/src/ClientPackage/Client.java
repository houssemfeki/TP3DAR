package ClientPackage;
import java.io.IOException;
import java.net.Socket;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			Socket socket = new Socket("localhost", 1234);
			System.out.println("je suis un client connecté ");	
			//Fermer socket 
		    socket.close();
	
		  }catch (IOException e){
			e.printStackTrace();
		}
	}
}