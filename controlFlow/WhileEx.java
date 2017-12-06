package controlFlow;

public class WhileEx {
	public static void main(String[] args) {
		//while (/*조건 */) {
			/* 반복실행할 실행문들 */
			
		//}
		
		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;
		}
		
		i = 0;
		outer:
		while (i < 5) {
			int j = 0;
			
			inner:
			while (j < 5) {
				if (i == 2 ) break outer;
				System.out.println("i=" + i + "; j=" + j);
				j++;
			}
			i++;
			
		}

		
		do {
			System.out.println("무조건 한번실행");
		} while (false);
		
		
		
		
		
		
		
		
	}
}
