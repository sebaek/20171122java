package quiz;

public class MyMain {
	public static void main(String[] args) {
		MyCollection c = new MyCollection(new int[]{2, 4, 5, 1, 10});
		System.out.println(c.sum());
		System.out.println(c.max());
		System.out.println(c.min());
		
		MyCollection d = new MyCollection(new int[]
								{-1, -18734, -822, 23984, 0, 999});
		System.out.println(d.sum());
		System.out.println(d.max());
		System.out.println(d.min());
				
	}
}
