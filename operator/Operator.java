package operator;

import java.math.BigDecimal;

public class Operator {
	public static void main(String[] args) {
		int a = Integer.MAX_VALUE;
		int b = 99;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(b % a);
		
		BigDecimal d = new BigDecimal(a);
		BigDecimal e = new BigDecimal(b);
		
		System.out.println(d.add(e));
		
		
		System.out.println(-b);
		b += 1;
		System.out.println(b);
		b -= 2;
		System.out.println(b);
		
		System.out.println(b++);
		System.out.println(b);
		
		System.out.println(++b);
		System.out.println(b);
		
		
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a >= b);
		
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println((a>b) ? a : b);
		
		
		
		
		
		
		
		
		
		
	}
}
