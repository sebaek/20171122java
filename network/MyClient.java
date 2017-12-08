package network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost", 9999);
		BufferedReader in = new BufferedReader(
				new InputStreamReader(socket.getInputStream()));
		PrintWriter out = new PrintWriter(
				socket.getOutputStream(), true);
		Scanner scanner = new Scanner(System.in);

		String inputstr;
		while ((inputstr = scanner.nextLine()) != null) {
			out.println(inputstr);
			System.out.println(in.readLine());
			
			if (inputstr.equals("bye")) {
				break;
			}
		}
		
		scanner.close();
		out.close();
		in.close();
		socket.close();
	}
}
