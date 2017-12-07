package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyMain2 {
	public static void main(String[] args) {
		File file = new File("src/text.txt");
		FileReader fr = null;
//		fr = new FileReader(file);
//		System.out.println((char) fr.read());
//		fr.close();
		try {
			fr = new FileReader(file);
			System.out.println((char) fr.read());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일을 찾지 못했습니다.");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("입출력 exception");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				
			}
		}
		
		
		
		
	}

}
