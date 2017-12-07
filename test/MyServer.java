package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket(9999);
		
		Socket clientSocket = serverSocket.accept();
		PrintWriter pw = new PrintWriter(clientSocket.getOutputStream(), true);
		BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		
		String inputLine = null;
		while ((inputLine = br.readLine()) != null) {
			pw.println(inputLine);
		}
	}
}
