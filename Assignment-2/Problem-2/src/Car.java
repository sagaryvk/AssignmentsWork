
public class Car {
	// States of  Car
	String name;
	String color;
	int gears ;
	int speed ;
	boolean autoGears;
	int fuelTankCapacity;
	int remainingFuelCapacity;
	final float carIdle = 1f; 
	public Car(String name, String color, int gears, int speed, boolean autoGears,int fuelTankCapacity) {
		
		this.name = name;
		this.color = color;
		this.gears = gears;
		this.speed = speed;
		this.autoGears = autoGears;
		this.fuelTankCapacity = fuelTankCapacity;
	}
	
	public void carSafety(boolean seatBelt)
	{
		
		if(seatBelt)
		{
			System.out.println("You follwed safety constraints");
		}
		else
		{
			System.err.println("Please wear Seat belt");
		}
			
	}
	public void carSafety(boolean seatBelt,float idle)
	{
		if(idle<carIdle)
		{
			System.out.println("Your car engine is ready to start. Checking for Seat belt.....");
			carSafety(seatBelt);
		}
		else
		{
			System.err.println("Your Idle is not stable. Please wait for sometime");
		}
	}

	// Functionalities of a Car
	public void currentGear(int newSpeed)
	{
		speed = newSpeed;
		if((speed > 0)&&(speed<20))
		{
			gears = 1;
		}
		else if((speed > 20)&&(speed<40))
		{
			gears = 2;
		}
		else if((speed > 20)&&(speed<80))
		{
			gears = 3;
		}
		else if((speed > 80)&&(speed<150))
		{
			gears = 4;
		}
		else
		{
			System.err.println("You Cannot drive at this speed limit");
		}
	}
	
	public void remainingTankCapacity(int capacityUsed)
	{
		
		remainingFuelCapacity = fuelTankCapacity - capacityUsed;
	}
	
	public int distanceToEmpty(int mileage)
	{
		int distEmpty = mileage*remainingFuelCapacity;
		return distEmpty;
		
	}
	
	public void displayValues()
	{
		System.out.println("The Name of Car is : "+name);
		System.out.println("The Color of Car is : "+color);
		System.out.println("The speed of the car is : "+speed);
		System.out.println("Current Gear of a Car is : "+gears);
		System.out.println("The total capacity of a fuel tank : "+fuelTankCapacity);
		System.out.println("The remaining tank capacity of a Car is : "+remainingFuelCapacity);
		System.out.println("Is the Car gear System is Automatic : "+autoGears);
		
	}
}
