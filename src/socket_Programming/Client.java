package socket_Programming;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
	public static void main(String[] arg) {
		try {
			Socket s = new Socket(InetAddress.getByName("localhost"), 20000);
//client to server			

			// outputstream

			DataOutputStream dout = new DataOutputStream(s.getOutputStream());

			dout.writeUTF("hello from client.....");

			dout.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
