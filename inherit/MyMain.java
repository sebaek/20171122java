package inherit;

public class MyMain {
	public static void main(String[] args) {
		SuperClass super1 = new SuperClass();
		super1.setNumber(500);
		super1.showNumber();
		super1.sayHello();
		
		SubClass sub1 = new SubClass();
		sub1.setNumber(300);
		sub1.showNumber();
		sub1.sayHello();
		
		SuperClass super2 = new SuperClass(700);
		super2.showNumber();
		super2.sayHello();
		
		SubClass sub2 = new SubClass(800);
		sub2.showNumber();
		sub2.sayHello();
		
		Super1Class sub3 = new SubClass(900);
		sub3.sayHello();
//		sub3.sayClassName();
		
		
		
		
		
		
	}

}
