package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) throws FileNotFoundException {
//		Scanner scanner = new Scanner(new File("src/text.txt"));
//		
//		System.out.println(scanner.nextLine());
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요.");
		
		String name = scanner.next();
		
		System.out.println("이름은 " + name + "입니다.");
		
		scanner.close();
	}
}
