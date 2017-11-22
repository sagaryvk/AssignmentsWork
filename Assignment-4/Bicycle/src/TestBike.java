import java.util.Scanner;


public class TestBike {

	public static void main (String args[])
	{
		 
     
	   MountainBike b1 = null;
	   RoadBike b2 = null;
	   TandemBike b3 = null;
	   boolean con = true;
	   do
	   {
	   Scanner sc = new Scanner (System.in);
	   System.out.println("Press 1 for MountainBike"+"\n"+"Press 2 Road Bike"+"\n"+"Press 3 for tandem Bike"+"\n"+"Press 4 for exit");
	   int number = sc.nextInt();
	   if(number == 1)
	   {    
		    b1 = new MountainBike();
		    b1.setName("Hercules");
		    b1.setCost(150.25f);
		    b1.setCapacity(1);
		    b1.setWeight(15);
		    b1.setCadence(60);
		    b1.setGears(2);
		    b1.setLoadGear(2); 
		    b1.displayValues();
			b1.currentSpeed();
			b1.currentSpeed(8);
			b1.currentGear(b1.getSpeed());
			b1.climbGear(4);
			b1.currentPedalCadence();
			MountainBike.mirrors("Circular");
			b1.additionalChainRing();
			b1.decelerationTime(5);
			b1.speedIncrement(7);
			b1.applyBrakes(6);	
			System.out.println("The distance travelled by the bike is "+ b1.distanceTravelled(20)+" K.m.s");
			
	   }
	 
	   else if(number == 2)
	   {
		    b2 = new RoadBike();

		    b2.setName("Hero");
		    b2.setCost(140f);
		    b2.setCapacity(1);
		    b2.setWeight(12);
		    b2.setCadence(80);
		    b2.setGears(3);
		    b2.displayValues();
		    b2.currentSpeed();
			b2.currentSpeed(10);
			b2.currentGear(b2.getSpeed());
			b2.currentPedalCadence();
			RoadBike.mirrors("square");
			b2.dropHandleBars();
			b2.decelerationTime(8);
			b2.speedIncrement(5);
			b2.applyBrakes(10);
			System.out.println("The distance travelled by the bike is "+ b2.distanceTravelled(20)+" K.m.s");
	   }
	   
	   else if(number == 3)
	   {
		   b3 = new TandemBike();
		   b3.setName("Honda");
		   b3.setCost(200f);
		   b3.setCapacity(2);
		   b3.setWeight(25);
		   b3.setCadence(75);
		   b3.setGears(3);
		   b3.displayValues();
		   b3.currentSpeed();
		   b3.currentSpeed(10);
		   b3.currentGear(b3.getSpeed());
		   b3.currentPedalCadence();
		   TandemBike.mirrors("circular");
		   b3.handleBars();
		   TandemBike.setMirrorSize1(26);
		   b3.decelerationTime(4);
		   b3.speedIncrement(5);
		   b3.applyBrakes(15);
		   System.out.println("The distance travelled by the bike is "+ b3.distanceTravelled(10)+" K.m.s");
		   
	   }
	   else if(number == 4)
	   {
		   
		   con = false;
		   
	   }
	   else
	   {
		   System.out.println("Please enter valid number");
	   }
	   
	   }
	   while(con);
	
	
	   
	}
	
}
