
public class RoadBike extends Bicycle {

	public RoadBike(String name, float cost, int capacity, int weight, int cadence, int gears) {
		super(name, cost, capacity, weight, cadence, gears);
		// TODO Auto-generated constructor stub
	}
	
	public void dropHandleBars()
	{
		System.out.println("This road bikes has drop handle bars");
	}

	
	//Method to calculate Gear in which bike is running based on speed
	@Override
	public void currentGear(double speed) {
		this.speed = speed;
		if(speed>0&& speed<5)
		{
			gears = 1;
			System.out.println("The speed of the bike is "+speed);
			System.out.println("The current gear of bike is " +gears );
		}
		else if(speed>=5 && speed<10)
		{
			gears = 2;
			System.out.println("The speed of the bike is "+speed);
			System.out.println("The current gear of bike is " +gears );
		}
		else if(speed>=10 && speed<20)
		{
			gears = 3;
			System.out.println("The speed of the bike is "+speed);
			System.out.println("The current gear of bike is " +gears );
		}
		else
		{
			System.err.println("You cant drive at this speed");
		}
		
	}

	@Override
	void decelerationTime(double decrementSpeed) {
		double decelerationTime = decrementSpeed/1.5;
		System.out.println("The time taken by bike to reduce speed of "+decrementSpeed+ " is "+decelerationTime+" seconds");
		
	}

	@Override
	public void speedIncrement(double incrementSpeed) {
		if((this.speed+incrementSpeed)>=20)
		{
			System.err.println("You can not drive at this speed");
		}
		else
		{
			this.speed = this.speed+incrementSpeed;
			System.out.println("The speed of bike after increasing speed of "+incrementSpeed+" is "+this.speed);
		}
		
	}

	
}
