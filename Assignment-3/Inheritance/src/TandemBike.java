
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
			else if(speed>8 && speed<12)
			{
				gears = 2;
				System.out.println("The speed of the bike is "+speed);
				System.out.println("The current gear of bike is " +gears );
			}
			else if(speed>12 && speed<20)
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


	final void handleBars()
	{
		System.out.println("The number of handle bars is " + handleBars);
	}
	
	

}
