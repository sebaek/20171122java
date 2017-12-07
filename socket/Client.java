package socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client extends Thread {
	
	private BufferedReader in;
	private PrintWriter out;
	ClientGroup group;

	public Client(Socket clientSocket) throws Exception {
		in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		out = new PrintWriter(clientSocket.getOutputStream(), true);
	}
	
	public void setGroup(ClientGroup g) {
		this.group = g;
	}
	
	public void run() {
		try {
			String str = null;
			while ((str = in.readLine()) != null) {
				System.out.println(str);
				group.sendAll(str);
				if (str.equals("bye")) {
					break;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			group.remove(this);
			try {
				in.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			out.close();
		}
	}
	
	public void send(String message) {
//		System.out.println("메세지 보냄");
		out.println(message);
	}

}
