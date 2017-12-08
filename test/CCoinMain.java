package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class CCoinMain {
	public static void main(String[] args) throws Exception {
		String urlstr = "https://www.google.com/search?q=bitcoin+price";
		
		URL url = new URL(urlstr);
		BufferedReader br = new BufferedReader(new InputStreamReader(
				url.openStream()));
		
		String str;
		
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
		
		br.close();
	}

}
