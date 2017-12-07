package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyMain {
	public static void main(String[] args) 
			throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("src/text.txt");
		
//		int i = 0;
//		while ((i = fr.read()) != -1) {
//			char c = (char) i;
//			System.out.println(c);
//		}
//		System.out.println(fr.read());
		
		FileWriter fw = new FileWriter("src/text2.txt");
		int i = 0;
		while ((i = fr.read()) != -1) {
			fw.write(i);
		}
		
		fw.close();
		fr.close();
		
		FileInputStream fi = new FileInputStream("src/text.txt");
//		System.out.println(fi.read());
		FileOutputStream fo = new FileOutputStream("src/text3.txt");
		
		while ((i = fi.read()) != -1) {
			fo.write(i);
		}
		
		fo.close();
		fi.close();
	}
}
