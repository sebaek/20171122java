package socket;

import java.util.HashSet;
import java.util.Set;

public class ClientGroup {
	private Set<Client> clients;
	
	public ClientGroup() {
		clients = new HashSet<>();
	}
	
	public void remove(Client c) {
		clients.remove(c);
	}
	
	public void sendAll(String message) {
		for (Client c : clients) {
			c.send(message);
		}
	}

	public void add(Client client) {
		clients.add(client);
//		System.out.println("clients 수:" + clients.size());
	}

}
