package referenceType;

public class ReferenceEx {
	public static void main(String[] args) {
		int i = 3;// 값(데이터)가 들어감.
		int j = i;
		j = 4;
		System.out.println(i);
		
		MyClass instance1 = new MyClass();
		instance1.myClassField = 500;
		System.out.println(instance1.myClassField);
		MyClass instance2 = instance1;
		System.out.println(instance2.myClassField);
		instance2.myClassField = 600;
		System.out.println(instance2.myClassField);
		System.out.println(instance1.myClassField);
		
		MyClass instance3 = new MyClass();
		instance3.myClassField = 700;
		System.out.println(instance3.myClassField);
		System.out.println(instance1.myClassField);
		System.out.println(instance2.myClassField);
		instance2 = instance3;
		instance2.myClassField = 800;
		System.out.println(instance3.myClassField);
		
		instance1.myClassField = 800;
		System.out.println(instance3 == instance1);
		System.out.println(instance3 == instance2);
		System.out.println(instance3.equals(instance1));
	}
}

class MyClass {
	int myClassField;
	
	@Override
	public boolean equals(Object obj) {
		return this.myClassField == ((MyClass) obj).myClassField;
	}
}
