package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import collection.set.Person;

public class MyMain {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("재석", "무한도전");
		map.put("수근", "아는형님");
		map.put("호동", "한끼줍쇼");
		map.put("재석", "런닝맨");
		
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println(map.get(key));
		}
		
		Map<Person, String> map2 = new HashMap<>();
		map2.put(new Person("솔빈", 99), "뉴스데스크");
		map2.put(new Person("솔빈", 99), "개그콘서트");
		map2.put(new Person("재석", 33), "무한도전");
		
		for (Person p : map2.keySet()) {
			System.out.println(map2.get(p));
		}
		
		Iterator<String> values = map2.values().iterator();
		while (values.hasNext()) {
			System.out.println(values.next());
		}
	}
}






