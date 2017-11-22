
public class MountainBike extends Bicycle {

	
	int loadGear;
	
	

	public MountainBike(String name, float cost, int capacity, int weight, int cadence, int gears) {
		super(name, cost, capacity, weight, cadence, gears);
		// TODO Auto-generated constructor stub
	}
	
	//Overridden Method to display current speed of a bike	
	@Override
	public void currentSpeed(double currentSpeed) {
		// TODO Auto-generated method stub
		super.currentSpeed(currentSpeed);
	}

	//Overridden Method to calculate Gear in which bike is running based on speed
	
	@Override
	public void currentGear(double speed) {
		this.speed = speed;
		if(speed>0&& speed<5)
		{
			
			gears = 1;
			System.out.println("The speed of the bike is "+speed);
			System.out.println("The current gear of bike is " +gears );
		}
		else if(speed>5 && speed<10)
		{
			gears = 2;
			System.out.println("The speed of the bike is "+speed);
			System.out.println("The current gear of bike is " +gears );
		}
		else
		{
			System.err.println("You cant drive at this speed");
		}
	}

	
	//Method to calculate load gear based on inclination
	public void climbGear(float inclination)
	{
		if(inclination>3 && inclination<5)
		{
			
			loadGear = 1;
			System.out.println("The bike is running at load gear "+loadGear);
		}
		else if(inclination>5 && inclination<10)
		{
			loadGear = 2;
			System.out.println("The bike is running at load gear "+loadGear);
		}
		else if(inclination>10)
		{
			System.out.println("Our load gear system don't support at this inclnation");
		}
		else
		{
			System.out.println("You can drive with out load Gear");
		}
	}
	
	public void additionalChainRing()
	{
		System.out.println("The additional chain ring will be attached to mountain bike to travel on mountains");
	}
	 
}
