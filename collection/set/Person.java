package collection.set;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void intro() {
		System.out.println("이름은 " + name + " 이고 나이는 " +
							age + "입니다.");
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode() + this.age;
	}
	
	@Override
	public boolean equals(Object obj) {
		Person o = (Person) obj;
		return this.name == o.name && this.age == o.age;
	}
}
