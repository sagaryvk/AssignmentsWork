
public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The Details Of First Car : ");
		Car car1 = new Car();
		car1.name = "BMW";
		car1.color = "White";
		car1.autoGears = true;
		car1.currentGear(96);
		car1.remainingTankCapacity(45);
		car1.displayValues();
		System.out.println("Your fuel tank will be empty in "+car1.distanceToEmpty(14)+" Kilometers");
		
		System.out.println("-----------------------------------------------------------");		
		System.out.println("The Details Of Second Car : ");
		Car car2 = new Car();
		car2.name = "Alto";
		car2.color = "Black";
		car2.autoGears = false;
		car2.currentGear(55);
		car2.remainingTankCapacity(34);
		car2.displayValues();
		System.out.println("Your fuel tank will be empty in "+car2.distanceToEmpty(20)+" Kilometers");	
	}

}
