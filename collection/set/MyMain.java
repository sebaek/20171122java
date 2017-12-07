package collection.set;

import java.util.HashSet;
import java.util.Set;

public class MyMain {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("솔빈");
		set.add("방탄");
		set.add("정국");
		set.add("아이유");
		set.add("아이유");
		
		for (String s : set) {
			System.out.println(s);
		}
		
		Set<Person> set2 = new HashSet<>();
		set2.add(new Person("방시혁", 35));
		set2.add(new Person("채연", 99));
		set2.add(new Person("재석", 88));
		set2.add(new Person("재석", 88));
		
		for (Person p : set2) {
			p.intro();
		}
		
		
		
		
		
		
		
		
	}
}
