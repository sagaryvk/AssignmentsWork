
public class Circle {
	
    // Fields of Circle
	double radius =0;
	double diameter =0;
	double areaRadius =0;
	double areaDiameter =0;
	double perimeterRadius =0;
	double perimeterDiameter =0;
	
	// method to calculate Area of a Circle
	public void calculateArea(double newRadiusValue, double newDiameterValue)
	{
		radius = newRadiusValue;
		diameter = newDiameterValue;
	 	areaRadius = Math.PI*Math.pow(radius, 2);
	 	areaDiameter = (Math.PI*Math.pow(diameter, 2))/4;
		
	}
	// Method to calculate perimeter of a Circle
	public void calculatePerimeter(double newRadiusValue, double newDiameterValue)
	{
		radius = newRadiusValue;
		diameter = newDiameterValue;
		perimeterRadius = 2*Math.PI*radius;
		perimeterDiameter = Math.PI*diameter;
		
	}
	
	//Method to diaplay output;
	public void displayValue()
	{
		System.out.println("Area Of Circle for given Radius "+radius+ " is: "+areaRadius);
		System.out.println("Area Of Circle for given diameter "+diameter+" is: "+areaDiameter);
		System.out.println("Perimeter Of Circle for given Radius "+radius+ " is: "+perimeterRadius);
		System.out.println("Perimeter Of Circle for given diameter "+diameter+" is: "+perimeterDiameter);
		
	}
}
