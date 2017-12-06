package controlFlow;

public class ForEx {
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		int i = 0;
		for ( ; i < 5; i++) {
			int k = 3;
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		int[] intArray = {5, 2, 1, 9, 10};
		
		for (int k = 0; k < intArray.length; k++) {
			System.out.println(intArray[k]);
		}
		
		for (int l : intArray) {
			System.out.println(l);
		}
		
		for (int m = 0; m < 5; m++) {
			if (m == 3) {
				break;
			}
			System.out.println(m);
		}
		
		for (int m = 0; m < 5; m++) {
			if (m == 3) {
				continue;
			}
			System.out.println(m);
		}
		
		
		
		
		//for ( /*1*/;/*2*/ ;/*4*/ /* 2,3,4 반복*/ ) {
			
			/*3*/
		//	System.out.println("무한루프");
			
		//}
		
		
		
	}
}
