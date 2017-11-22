
public class TandemBike extends MountainBike {

	private final int handleBars = 2;
	//private double speed1 = 0;
	
	public TandemBike() {
		
	}
	


	public int getHandleBars() {
		return handleBars;
	}


	//Method to calculate Gear in which bike is running based on speed
	@Override
	public void currentGear(double speed) {
		   setSpeed(speed);
			if(speed>0&& speed<8)
			{
				setGears(1);
				System.out.println("The speed of the bike is "+speed);
				System.out.println("The current gear of bike is " +getGears() );
			}
			else if(speed>=8 && speed<12)
			{
				setGears(2);
				System.out.println("The speed of the bike is "+speed);
				System.out.println("The current gear of bike is " +getGears() );
			}
			else if(speed>=12 && speed<25)
			{
				setGears(3);
				System.out.println("The speed of the bike is "+speed);
				System.out.println("The current gear of bike is " +getGears() );
			}
			else
			{
				System.err.println("You cant drive at this speed");
			}
			
		
	}


	@Override
	public void decelerationTime(double decrementSpeed) {
		double decelerationTime = decrementSpeed;
		System.out.println("The time taken by bike to reduce speed of "+decrementSpeed+ " is "+decelerationTime+" seconds");
		
	}


	@Override
	public void speedIncrement(double incrementSpeed) {
		double incSpeed;
		if((getSpeed()+incrementSpeed)>=25)
		{
			System.err.println("You can not drive at this speed");
		}
		else
		{
			incSpeed = getSpeed()+incrementSpeed;
			System.out.println("The speed of bike after increasing speed of "+incrementSpeed+" is "+incSpeed);
		}
		
	}


	final void handleBars()
	{
		System.out.println("The number of handle bars is " + handleBars);
	}
	
	

}
