
public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The Details Of First Car : ");
		Car car1 = new Car("BMW","White",4,0,true,150);
		car1.currentGear(96);
		car1.remainingTankCapacity(45);
		car1.displayValues();
		car1.carSafety(true);
		car1.carSafety(false, 0.9f);
		System.out.println("Your fuel tank will be empty in "+car1.distanceToEmpty(14)+" Kilometers");
		
		System.out.println("-----------------------------------------------------------");		
		System.out.println("The Details Of Second Car : ");
		Car car2 = new Car("Alto","Blue",4,0,false,120);
		car2.currentGear(55);
		car2.remainingTankCapacity(34);
		car2.displayValues();
		car2.carSafety(true);
		car2.carSafety(true, 2f);
		System.out.println("Your fuel tank will be empty in "+car2.distanceToEmpty(20)+" Kilometers");	
	}

}
