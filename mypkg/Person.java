package mypkg;

public class Person {

	String name;
	int age;
	
	public Person() {
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void introduce() {
		int age = 3;
		System.out.println("내 이름은 " + this.name + "이고 " +
				           " 나이는 " + this.age + "입니다.");
	}
}
