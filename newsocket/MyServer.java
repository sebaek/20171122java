package newsocket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	public static void main(String[] args) throws Exception {
		ServerSocket socket = new ServerSocket(9999);
		Socket client = socket.accept();
		
		PrintWriter out = new PrintWriter(client.getOutputStream(), true);
		BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
		
		String str;
		while ((str = in.readLine()) != null) {
			out.println("echo: " + str);
			if (str.equals("bye")) {
				break;
			}
		}
		
		
		in.close();
		out.close();
	}
}
