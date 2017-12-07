package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Main {
	public static void main(String[] args) throws Exception {
		URL url = new URL("https://www.naver.com");
		URLConnection urlc = url.openConnection();
		BufferedReader in = new BufferedReader(
				new InputStreamReader(urlc.getInputStream()));
		
		String line;
		while ((line = in.readLine()) != null) {
			System.out.println(line);
		}
		
		in.close();
		
	}
}
