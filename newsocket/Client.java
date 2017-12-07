package newsocket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		Socket s = new Socket("localhost", 9999);
		PrintWriter out = new PrintWriter(s.getOutputStream(), true);
		BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String str;
		
		while ((str = scanner.nextLine()) != null) {
			
			out.println(str);
			System.out.println(in.readLine());
			
			if (str.equals("bye")) {
				break;
			}
		}
		
		in.close();
		out.close();
		s.close();
		scanner.close();
	}
}
