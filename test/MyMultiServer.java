package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

public class MyMultiServer {
	public static void main(String[] args) throws Exception {

		ServerSocket server = new ServerSocket(9999);
		Set<Socket> clients = new HashSet<>();

		while (true) {
			final Socket client = server.accept();
			clients.add(client);

			Thread thread = new Thread(new Runnable() {

				@Override
				public void run() {
					Socket c = client;

					try (
							BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
							PrintWriter pw = new PrintWriter(client.getOutputStream(), true);
					) {
						

					} catch (IOException e) {

						e.printStackTrace();
					}

				}
			});
			thread.start();
		}

	}
}
