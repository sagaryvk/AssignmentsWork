
public class Car {
	// States of  Car
	String name;
	String color;
	int gears = 0;
	float speed = 0;
	boolean autoGears = false;
	int fuelTankCapacity = 150;
	
	// Functionalities of a Car
	public void currentGear(float newSpeed)
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
		
		fuelTankCapacity = fuelTankCapacity - capacityUsed;
	}
	
	public int distanceToEmpty(int mileage)
	{
		int distEmpty = mileage*fuelTankCapacity;
		return distEmpty;
		
	}
	
	public void displayValues()
	{
		System.out.println("The Name of Car is : "+name);
		System.out.println("The Color of Car is : "+color);
		System.out.println("The speed of the car is : "+speed);
		System.out.println("Current Gear of a Car is : "+gears);
		System.out.println("The ramianing tank capacity of a Car is : "+fuelTankCapacity);
		System.out.println("Is the Car gear System is Automatic : "+autoGears);
		
	}
}
