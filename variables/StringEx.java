package variables;

public class StringEx {
	public static void main(String[] args) {
		String str = "가나다";
		String str2 = "삼다수";
		String str3 = str + str2;
		System.out.println(str3);
		
		String str4 = "삼다수";
		
		System.out.println(str2 == str4);
		
		String str5 = new String("삼다수");
		System.out.println(str5);
		System.out.println(str2 == str5);
		System.out.println(str2.equals(str5));
	}
}




