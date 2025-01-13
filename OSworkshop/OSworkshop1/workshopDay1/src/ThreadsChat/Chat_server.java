package ThreadsChat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Chat_server {
static int port = 2999;

	


	public static void main(String[]args) throws IOException {
		System.out.println("\t\t Simple Server");
		System.out.println("\t\t =========");
		
		ServerSocket serversocket = new ServerSocket(port);
		int current_client=1;

		try {
			while(true) {
				Socket socket = serversocket.accept();
				System.out.println("Client is connected...\n\n");
				
				Server_Thread ct = new Server_Thread(client,current_client);
				ct.start();
				current_client++;
			}
		}
				
		finally {
			serversocket.close();
		}
	}

}