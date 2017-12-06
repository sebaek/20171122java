package controlFlow;

public class SwitchEx {
	public static void main(String[] args) {
		String s = "Java";
		switch (s) {
		case "java":
			System.out.println("java는 재미있다.");
//			break;
		case "c++":
			System.out.println("c++은 재미있다.");
			break;

		default:
			System.out.println("없다.");
			break;
		}
	}
}
