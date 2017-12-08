package test2;

public class MyMain {
	public static void main(String[] args) {
		Car car = new Car(new MichellWheel(), new LgWindow());
		car.drive();
	}
}
