
public interface InterfaceBikes {

	final int wheels =2;
	
	public void currentSpeed();
	public void currentSpeed(double currentSpeed);
	public void currentGear(double speed);
	public void decelerationTime(double decrementSpeed);
	public void speedIncrement(double incrementSpeed);
	public double distanceTravelled(double time);
	public void applyBrakes(double decrementSpeed);
	public void currentPedalCadence();
}

