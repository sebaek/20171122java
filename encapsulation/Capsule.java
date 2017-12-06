package encapsulation;

public class Capsule {
	public static void main(String[] args) {
		Car mycar = new Car();
		
		System.out.println("현재 연료는 " + mycar.getFuel() + ".");
		System.out.println("현재 속도는 " + mycar.getSpeed() + ".");
		
		mycar.addFuel();
//		mycar.gas += 10;
		mycar.accel();
		
		System.out.println("현재 연료는 " + mycar.getFuel() + ".");
		System.out.println("현재 속도는 " + mycar.getSpeed() + ".");
	}

}
