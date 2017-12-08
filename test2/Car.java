package test2;

public class Car {
	private Wheel wheel;
	private Window window;
	
	public Car(Wheel wheel, Window window) {
		this.wheel = wheel;
		this.window = window;

	}
	
	public void drive() {
		wheel.rolling();
		window.down();
	}
}
