package socket;

import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
	static ServerSocket serverSocket;
	
	public static void main(String[] args) throws Exception {
		serverSocket = new ServerSocket(9999);
		ClientGroup cgroup = new ClientGroup();
		while (true) {
			Socket clientSocket = serverSocket.accept();
			Client client = new Client(clientSocket);	
			cgroup.add(client);
			client.setGroup(cgroup);
			client.start();
		}
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		serverSocket.close();
	}
}
