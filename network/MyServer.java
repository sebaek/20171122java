package network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(9999);
		Socket client = server.accept();
		
		BufferedReader in = new BufferedReader(
				new InputStreamReader(
						client.getInputStream()));
		
		PrintWriter out = new PrintWriter(
				client.getOutputStream(), true);
		
		String line;
		
		while ((line = in.readLine()) != null) {
			StringBuffer sb = new StringBuffer(line);
			out.println("server: " + sb.reverse().toString());
			
			if (line.equals("bye")) { 
				break;
			}
		}
		
		out.close();
		in.close();
		client.close();
		server.close();
	}
}
