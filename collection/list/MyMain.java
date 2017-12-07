package collection.list;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MyMain {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("리사");
		list.add("제니");
		list.add("로제");
		list.add("지수");
		list.add(new File(""));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("1번 index 삭제");
		list.remove(1);
		
		for (Object o : list) {
			System.out.println(o);
		}
		
		String str = (String) list.get(0);
		
		Object n = (Integer) list.get(1);
		String m = null;
		if (n instanceof String) {
			m = (String) n;
		}
		
		List<String> list2 = new ArrayList<>();
		list2.add("웬디");
		list2.add("아이린");
		list2.add("슬기");
//		list2.add(new File(""));
		
		for (String o : list2) {
			System.out.println(o);
		}
	
		
		
		
		
		
	}
}
