package accessModifier;

import mypkg.Person;

public class MyMain {
	public static void main(String[] args) {
		NewClass i1 = new NewClass();
		Person p1 = new Person();
//		p1.name = "웬디";
		i1.publicField = 100;
		i1.defaultField = 200;
//		i1.privateField = 300;
	}
}
