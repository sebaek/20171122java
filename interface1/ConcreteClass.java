package interface1;

public class ConcreteClass implements MyInterface, MyInterface2 {

	@Override
	public void sayHello() {
		System.out.println("콘크리트클래스입니다.");
		
	}

}
