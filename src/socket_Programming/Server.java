package socket_Programming;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main(String[] arg)
	{
		try {
			ServerSocket ss = new ServerSocket(20000);
			
			Socket client_socket = ss.accept();
			
			DataInputStream din = new DataInputStream(client_socket.getInputStream());
			
			String input = din.readUTF();
			
			System.out.println("Message from client: "+input);
			
			
			
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
