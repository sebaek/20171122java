package exception;

import java.io.File;
import java.io.FileReader;

public class MyMain2 {
	public static void main(String[] args) {
		File file = new File("src/text.txt");
		FileReader fr = null;
		fr = new FileReader(file);
		System.out.println((char) fr.read());
		fr.close();
//		try {
//			fr = new FileReader(file);
//			System.out.println((char) fr.read());
//
//		} catch (FileNotFoundException e) {
//			System.out.println("파일을 찾지 못했습니다.");
//		} catch (IOException e) {
//			System.out.println("입출력 exception");
//		} finally {
//			try {
//				fr.close();
//			} catch (IOException e) {
//				
//			}
//		}
		
		
		
		
	}

}
