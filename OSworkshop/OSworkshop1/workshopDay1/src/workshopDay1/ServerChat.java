package workshopDay1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerChat {
    static int port = 1999;

    public static void main(String[] args) throws IOException {
        System.out.println("\t\t Chat Server");
        System.out.println("\t\t =======");

        ServerSocket serversocket = new ServerSocket(port);
        Scanner scannerInput = new Scanner(System.in);

        try {
            while (true) {
                Socket socket = serversocket.accept();
                System.out.println("Client is connected...\n\n");

                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                try {
                    out.println("Welcome to chat application");
                    String input, output;
                    while (true) {
                        input = in.readLine();
                        if (input == null || input.equalsIgnoreCase("exit")) {
                            System.out.println("Client has disconnected.");
                            break;
                        }
                        System.out.println("Client says: " + input);

                        System.out.print("Server: ");
                        output = scannerInput.nextLine();
                        out.println(output);
                    }
                } finally {
                    socket.close();
                    out.close();
                    in.close();
                }
            }
        } finally {
            serversocket.close();
            scannerInput.close();
        }
    }
}

		
		
		
	


