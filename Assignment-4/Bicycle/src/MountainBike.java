
public class MountainBike implements InterfaceBikes {

	private String name;
	private float cost;
	private int gears;
	private int weight;
	private int cadence;
	private int capacity;
	private double speed=0;
	private static int mirrorSize1 = 11;
	private static int mirrorSize2 = 14;
	private int loadGear;
		

	public MountainBike() {
		
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public float getCost() {
		return cost;
	}



	public void setCost(float cost) {
		this.cost = cost;
	}



	public int getGears() {
		return gears;
	}



	public void setGears(int gears) {
		if(gears<=3)
		{
		this.gears = gears;
		}
		else
		{
			System.err.println("Invalid number of gears");
		}
	}



	public int getWeight() {
		return weight;
	}



	public void setWeight(int weight) {
		this.weight = weight;
	}



	public int getCadence() {
		return cadence;
	}



	public void setCadence(int cadence) {
		this.cadence = cadence;
	}



	public double getSpeed() {
		return speed;
	}



	public void setSpeed(double speed) {
		this.speed = speed;
	}



	public static int getMirrorSize1() {
		return mirrorSize1;
	}



	public static void setMirrorSize1(int mirrorSize1) {
		MountainBike.mirrorSize1 = mirrorSize1;
	}



	public static int getMirrorSize2() {
		return mirrorSize2;
	}



	public static void setMirrorSize2(int mirrorSize2) {
		MountainBike.mirrorSize2 = mirrorSize2;
	}



	public int getLoadGear() {
		return loadGear;
	}



	public void setLoadGear(int loadGear) {
		if(loadGear >2)
		{
			System.err.println("Invalid Load Gear");
		}
		else
		{
		this.loadGear = loadGear;
		}
	}

	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		if(capacity<=2)
		{
		this.capacity = capacity;
		}
		else
		{
			System.err.println("Capacity excceded");
		}
	}



	//Method to check whether bike is in motion using current speed value	

	public void currentSpeed()
	{
		if(speed == 0)
		{
			System.out.println("The bike is in rest");
		}
		else
		{
			System.out.println("The bike is in motion");
			
		}
	}

	//Overloaded Method to display current speed of a bike
	
	public void currentSpeed(double currentSpeed)
	{
		speed = currentSpeed;
		
	}
	
	// Static method to get the mirror size of bike
	
	public static void mirrors(String type)
	{
		if(type.equalsIgnoreCase("circular"))
			{
				
				System.out.println("The circular shaped mirror size is "+mirrorSize1);
			}
		else if(type.equalsIgnoreCase("square"))
			{
				
				System.out.println("The square shaped mirror size is "+mirrorSize2);
			}
			
	}
	// Method to calculate Gear in which bike is running based on speed	
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
		else
		{
			System.err.println("You cant drive at this speed");
		}
	}

	
	
	
	public void decelerationTime(double decrementSpeed) {
	
		double decelerationTime = decrementSpeed/2;
		System.out.println("The time taken by bike to reduce speed of "+decrementSpeed+ " is "+decelerationTime+" seconds");	
		
	}

	
	@Override
	public void speedIncrement(double incrementSpeed) {
		if((this.speed+incrementSpeed)>=10)
		{
			System.err.println("You can not drive at this speed");
		}
		else
		{
			this.speed = this.speed+incrementSpeed;
			System.out.println("The speed of bike after increasing speed of "+incrementSpeed+" is "+this.speed);
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
	
	 public double distanceTravelled(double time)
	    {
	    	double distance = speed*time;
	    	return distance;
	    }
	    
	    // Method to calculate speed after applying brakes
	    public void applyBrakes(double decrementSpeed)
	    {
	    	if(this.speed > decrementSpeed )
	    	{
	    	this.speed = this.speed - decrementSpeed;
	    	System.out.println("The speed of bike after applying brake after decreasing speed "+decrementSpeed+" is "+ this.speed);
	    	}
	    	else
	    	{
	    		System.out.println("The bike is stopped");
	    	}
	    }
	    
	    //Method to display pedal Cadence of a bike
	    
	    public void currentPedalCadence()
	    {
	    	System.out.println("The current pedal cadence is "+ cadence);
	    }
	    
	    

	public void additionalChainRing()
	{
		System.out.println("The additional chain ring will be attached to mountain bike to travel on mountains");
	}
	//Method to display values
    
    public void displayValues()
    {
    	System.out.println("The name of a bicycle is "+name);
    	System.out.println("The cost of a bicycle is "+cost);
    	System.out.println("The total numer of gears "+gears);    	
    	
    }
    
	 
}
