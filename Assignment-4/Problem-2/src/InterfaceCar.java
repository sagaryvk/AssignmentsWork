
public interface InterfaceCar {
	
	float carIdle = 1f; 
	
	public void carSafety(boolean seatBelt);
	public void carSafety(boolean seatBelt,float idle);
	public void currentGear(int newSpeed);
	public void remainingTankCapacity(int capacityUsed);
	public int distanceToEmpty(int mileage);

}
