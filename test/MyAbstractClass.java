package test;

public abstract class MyAbstractClass {
	
	public void myMethod() {
		String name = myMethod2();
		System.out.println(name);
	}
	
	public abstract String myMethod2();
}
