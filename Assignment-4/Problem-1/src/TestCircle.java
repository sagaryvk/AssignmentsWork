
public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("The Detalis Of First Circle : ");	
  	    InterfaceShapes	circle1 = new Circle();	
  	    Circle circle11 = (Circle)circle1;
		circle11.setRadius(4);
		circle11.setDiameter(8);
		circle1.calculateArea();
		circle1.calculatePerimeter();	
		circle11.displayValue();
		
		
		System.out.println("-----------------------------------------------------------");		
		System.out.println("The Detalis Of Second Circle : ");
		Circle circle2 = new Circle();
		circle2.setRadius(5);
		circle2.setDiameter(10);
		circle2.calculateArea();
		circle2.calculatePerimeter();
		circle2.displayValue();
		
	}

}
