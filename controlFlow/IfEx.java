package controlFlow;

public class IfEx {
	public static void main(String[] args) {

		if (true) {
			System.out.println("무조건 참입니다.");
		}

		if (false) {
			System.out.println("무조건 거짓입니다.");
		}

		int i = 5;
		if (i > 3) {
			System.out.println("i는 3보다 큽니다.");
		}

		if (i > 3 && i < 7) {
			System.out.println("i는 3보다 크고 7보다 작다.");
		}

		if (i < 3 || i > 7) {
			System.out.println("i는 3보다 작거나 7보다 크다.");
		}

		// i > 7 식은 실행되지 않음.
		if (i < 3 && i > 7) {
			System.out.println("i는 3보다 작거나 7보다 크다.");
		}

		// i > 7 식은 실행되지 않음.
		if (i > 3 || i > 7) {
			System.out.println("i는 3보다 크거나 7보다 크다.");
		}

		// if 문의 실행문이 하나이면 중괄호 생략 가능.
		if (i > 3 || i > 7)
			System.out.println("i는 3보다 작거나 7보다 크다.");

		if (i > 7) {
			System.out.println("i는 7보다 큽니다.");
		} else {
			System.out.println("i는 7보다 크지 않습니다.");
		}

		if (i > 2) {
			System.out.println("i는 2보다 크다.");
		} else if (i > 5) {
			System.out.println("i는 5보다 크다.");
		} else if (i > 7) {
			System.out.println("i는 7보다 크다.");
		} else {
			System.out.println("위의 조건이 모두 만족되지 않았다.");
		}

	}

}
