package mypkg;

public class MyMain {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("슬기", 12);
		p1.name = "웬디";
		p1.introduce();
		p2.introduce();
	}
}
