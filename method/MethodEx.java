package method;

public class MethodEx {
	public static void main(String[] args) {
		
	}
	
	/*
	 * 접근지정자 리턴타입 메소드명(파라미터타입 파라미터명...) {
	 * 		실행문;;;
	 * 		;;
	 * 		;;
	 * }
	 */
	void myMethod1() {
		return;
	}
	
	int myMethod2() {
		int a = 10;
		
		return a + 3;
	}
	
	String myMethod3() {
		
		return "hi";
	}
	
	private String myMethod4() {
		return "hello";
	}
	
	public String myMethod5() {
		return "what";
	}
	
	public String myMethod6(String name) {
		
		return "hello " + name;
	}
	
	/* 메소드명과 파라미터 타입과 순서의 조합을
	 * 메소드 시그니처라고 한다.
	 */
	
	public String myMethod6() {
		return "hello " + "world";
	}
	
	public String myMethod6(int i) {
		return "hello " + i;
	}
	
	public String myMethod6(int i, String name) {
		return "hello " + i;
	}
	
	public String myMethod6(String name, int i) {
		return "hello " + i;
	}
	
//	public void myMethod6(String name, int i) {
//		return;
//	}
	
	
	
	
	
}
