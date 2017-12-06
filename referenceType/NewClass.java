package referenceType;

public class NewClass {
	static String group;
	String name;
	int number;
	
	
	NewClass() {
		this.name = "리사";
		this.number = 300;
		System.out.println("객체가 생성되었습니다.");
	}
	
	NewClass(String name) {
		this.name = name;
		
	}
	
	NewClass(String name, int number) {
		this(name);
		this.number = number;
	}
	
	
	void sayName() {
		String name = "java";
		System.out.println("우리 그룹은 " + group + "입니다.");
		System.out.println("내 이름은 " + this.name + "입니다.");
	}
	
	static void sayGroupName() {
		System.out.println("우리 그룹은 " + group + "입니다.");
//		System.out.println("내 이름은 " + this.name + "입니다.");
	}
}
