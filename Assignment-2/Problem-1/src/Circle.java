
public class Circle {
	
    // Parameterized Constructor that takes radius and diameter
	
	
	double radius;
	double diameter;
	double areaRadius;
	double areaDiameter;
	double perimeter;
	
	 
	
	public Circle(double radius, double diameter) {
		
		this.radius = radius;
		this.diameter = diameter;
	}

	
	// method to calculate Area of a Circle
	public void calculateArea()
	{
		
	 	areaRadius = Math.PI*Math.pow(radius, 2);
	 	areaDiameter = (Math.PI*Math.pow(diameter, 2))/4; 
		
	}
	// Method to calculate perimeter of a Circle
	public double calculatePerimeter()
	{
		
		perimeter = 2*Math.PI*radius;
	    return perimeter ;
		
		
	}
	
	//Method to diaplay output;
	public void displayValue()
	{
		System.out.println("Area Of Circle for given Radius "+radius+ " is: "+areaRadius);
		System.out.println("Area Of Circle for given diameter "+diameter+" is: "+areaDiameter);
		System.out.println("Perimeter Of Circle is "+perimeter);
		
		
	}
}
