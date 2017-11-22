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
		    b1 = new MountainBike("Hercules",150.25f,1,15,60,2);
		    
		    b1.displayValues();
			b1.currentSpeed();
			b1.currentSpeed(8);
			b1.currentGear(b1.speed);
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
		    b2 = new RoadBike("Hero",140f,1,12,80,3);

		    b2.displayValues();
		    b2.currentSpeed();
			b2.currentSpeed(10);
			b2.currentGear(b2.speed);
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
		   b3 = new TandemBike("Honda",200f,2,25,75,3);
		   b3.displayValues();
		   b3.currentSpeed();
		   b3.currentSpeed(10);
		   b3.currentGear(b3.speed);
		   b3.currentPedalCadence();
		   TandemBike.mirrors("circular");
		   b3.handleBars();
		   TandemBike.mirrorSize1 =26;
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
