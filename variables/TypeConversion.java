package variables;

public class TypeConversion {
	public static void main(String[] args) {
		int i = 50000;
		long l = i;
//		short s = i;
		
		float f = 33.3F;
		double d = f;
//		f = d;
		f = l;
		d = l;
		
		char c = '\u0041';
		System.out.println(c);
		i = c;
		
		i = (int) l;
		f = (float) d;
	}
}






