package inherit;

public class SuperClass extends Super1Class {
	private int number;
	protected int age;
	
	public SuperClass() {
		
	}
	
	public SuperClass(int number) {
		this.number = number;
	}
	
	public static void sayClassName() {
		System.out.println("SuperClass static 메소드");
	}

	public void showNumber() {
		System.out.println(this.number);
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void sayHello() {
		System.out.println("저는 super클래스입니다.");
	}
}
