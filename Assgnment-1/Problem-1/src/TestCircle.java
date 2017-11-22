
public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The Detalis Of First Circle : ");
		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		circle1.calculateArea(4, 8);
		circle1.calculatePerimeter(4, 8);
		circle1.displayValue();
		
		System.out.println("-----------------------------------------------------------");		
		System.out.println("The Detalis Of Second Circle : ");
		circle2.calculateArea(5, 10);
		circle2.calculatePerimeter(5, 10);
		circle2.displayValue();
		

	}

}
