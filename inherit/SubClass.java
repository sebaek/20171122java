package inherit;

public class SubClass extends SuperClass {
	public SubClass() {
		super();
	}
	
	public SubClass(int number) {
		super(number);
		super.age = 3;
	}
	
	public static void sayClassName() {
		System.out.println("SubClass static 메소드");
	}

	public void sayHello() {
//		super.sayHello();
		System.out.println("저는 sub클래스입니다.");
	}
}
