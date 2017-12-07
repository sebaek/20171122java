package pattern;

public class MyMain {
	public static void main(String[] args) {
		
		String str = "가나다";
		System.out.println(str.matches("\\p{IsHangul}{3}"));
		
	}
}	
