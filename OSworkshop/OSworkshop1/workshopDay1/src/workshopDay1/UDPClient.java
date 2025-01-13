package workshopDay1;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;


public class UDPClient {

	public static void main(String[] args) throws IOException {
		DatagramSocket client = new DatagramSocket()	;
		InetAddress ipAddress = InetAddress.getLocalHost();
		
		String str = "Hello World";
		byte[] buf = str.getBytes();
		
		DatagramPacket pac = new  DatagramPacket(buf,buf.length,ipAddress,4411);
		client.send(pac);
		client.close();
		
		// TODO Auto-generated method stub

	}

}
