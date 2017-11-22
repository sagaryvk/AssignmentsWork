
public class TandemBike extends Bicycle {

	final int handleBars = 2;

	public TandemBike(String name, float cost, int capacity, int weight, int cadence, int gears) {
		super(name, cost, capacity, weight, cadence, gears);
		// TODO Auto-generated constructor stub
	}
	
	
	//Method to calculate Gear in which bike is running based on speed
	
	  @Override
	public void currentGear(double speed) {
		  this.speed = speed;
			if(speed>0&& speed<8)
			{
				gears = 1;
				System.out.println("The speed of the bike is "+speed);
				System.out.println("The current gear of bike is " +gears );
			}
			else if(speed>=8 && speed<12)
			{
				gears = 2;
				System.out.println("The speed of the bike is "+speed);
				System.out.println("The current gear of bike is " +gears );
			}
			else if(speed>=12 && speed<25)
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
		double decelerationTime = decrementSpeed;
		System.out.println("The time taken by bike to reduce speed of "+decrementSpeed+ " is "+decelerationTime+" seconds");
		
	}


	@Override
	public void speedIncrement(double incrementSpeed) {
		if((this.speed+incrementSpeed)>=25)
		{
			System.err.println("You can not drive at this speed");
		}
		else
		{
			this.speed = this.speed+incrementSpeed;
			System.out.println("The speed of bike after increasing speed of "+incrementSpeed+" is "+this.speed);
		}
		
	}


	final void handleBars()
	{
		System.out.println("The number of handle bars is " + handleBars);
	}
	
	

}
