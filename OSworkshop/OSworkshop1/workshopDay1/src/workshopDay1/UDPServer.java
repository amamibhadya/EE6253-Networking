package workshopDay1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;




public class UDPServer {

	public static void main(String[] args) throws IOException {
		DatagramSocket server = new DatagramSocket(4411);
		byte[] buf = new byte[256];
		
		DatagramPacket packet = new DatagramPacket(buf,buf.length);
		server.receive(packet);
		String response = new String(packet.getData());
		
		System.out.println("Recieved Data:" +response);
		server.close();
		
		
		// TODO Auto-generated method stub

	}

}
