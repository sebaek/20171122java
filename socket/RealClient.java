package socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class RealClient {

	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost", 9999);
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
		final BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					System.out.println("메시지 받기 시작");
					String str;
					while ((str = in.readLine()) != null ) {
						System.out.println("echo:" + str);
					}
					System.out.println("메시지 받기 종료");
				} catch (Exception e1) {
					e1.printStackTrace();
					try {
						in.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
				
			}
		});
		
		t.start();
		
		Scanner scanner = new Scanner(System.in);
		String message;
		while ((message = scanner.nextLine()) != null) {
//			System.out.println(message);
			out.println(message);
			
			if (message.equals("bye")) {
				break;
			}
		}
		
		in.close();
		scanner.close();
		socket.close();
	}
}
