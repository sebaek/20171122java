package referenceType;

public class ClassEx {
	public static void main(String[] args) {
		NewClass i1 = new NewClass();
		i1.name = "로제";
		i1.number = 99;
		i1.group = "블랙핑크";
		
		NewClass i2 = new NewClass();
		i2.name = "지수";
		i2.number = 112;
		i2.group = "방탄";
		
		NewClass.group = "곰돌이";
		
		System.out.println(i1.name);
		System.out.println(i2.name);
		System.out.println(i1.group);
		System.out.println(i2.group);
	}
}
