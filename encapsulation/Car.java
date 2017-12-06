package encapsulation;

public class Car {
	private int gas;
	private int speed;
	
	public void addFuel() {
		System.out.println("유사연료가 아닌지 확인하기");
		this.gas += 10;
	}
	
	public void accel() {
		this.speed += 10;
		this.gas -= 1;
	}
	
	public int getFuel() {
		return this.gas;
	}
	
	public int getSpeed() {
		return this.speed;
	}

}
