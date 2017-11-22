
public class Bicycle {
	String name;
	float cost;
	int gears;
	int weight;
	int cadence;
	double speed=0;
	final int wheels =2;
	static int mirrorSize1 = 11;
	static int mirrorSize2 = 14;
	
	
	
	public Bicycle(String name, float cost, int capacity, int weight,int cadence,int gears) {
		
		this.name = name;
		this.cost = cost;
		this.gears = gears;
		this.weight = weight;
		this.cadence = cadence;
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
	
	//Method to calculate distance travelled by the bike
	
    public double distanceTravelled(double time)
    {
    	double distance = speed*time;
    	return distance;
    }
    
    //Method to calculate Gear in which bike is running based on speed
    
    public void currentGear(double speed)
    {
    	
    	System.out.println("It will shift gears based on speed");
    }
    
    //Method to display pedal Cadence of a bike
    
    public void currentPedalCadence()
    {
    	System.out.println("The current pedal cadence is "+ cadence);
    }
    
    //Method to display values
    
    public void displayValues()
    {
    	System.out.println("The name of a bicycle is "+name);
    	System.out.println("The cost of a bicycle is "+cost);
    	System.out.println("The total numer of gears "+gears);
    	
    	
    }
    
}
