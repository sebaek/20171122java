package exception;

public class MyMain {
	public static void main(String[] args) {
		int i = divide(9, 0);
		System.out.println(i);
		
		
		
	}
	
	public static int divide(int a, int b) {
		int r = 0;
		try {
			r = a / b;
			System.out.println("0으로 안나눔");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누지마!");
		} catch (NullPointerException e) {
			System.out.println("참조가 없습니다.");
		} finally {
			System.out.println("무조건 실행");
		}
		
		return r;
	}
}
