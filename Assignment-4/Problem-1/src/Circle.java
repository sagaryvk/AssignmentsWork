
public class Circle implements InterfaceShapes{
	
    // Parameterized Constructor that takes radius and diameter
	
	
	private double radius;
	private	double diameter;
	private double areaRadius;
	private double areaDiameter;
	private double perimeter;

	public Circle() {
		}

	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	public double getDiameter() {
		return diameter;
	}


	public void setDiameter(double diameter) {
		if(diameter == (2*this.radius))
				{
		this.diameter = diameter;
				}
		else
		{
			System.err.println("Invalid diameter value");
		}
	}


	public double getAreaRadius() {
		return areaRadius;
	}


	public void setAreaRadius(double areaRadius) {
		this.areaRadius = areaRadius;
	}


	public double getAreaDiameter() {
		return areaDiameter;
	}


	public void setAreaDiameter(double areaDiameter) {
		this.areaDiameter = areaDiameter;
	}


	public double getPerimeter() {
		return perimeter;
	}


	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
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
