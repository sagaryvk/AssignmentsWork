
public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The Detalis Of First Circle : ");
		Circle circle1 = new Circle(4,8);
		
		circle1.calculateArea();
		circle1.calculatePerimeter();
		circle1.displayValue();
		
		System.out.println("-----------------------------------------------------------");		
		System.out.println("The Detalis Of Second Circle : ");
		Circle circle2 = new Circle(5,10);
		circle2.calculateArea();
		circle2.calculatePerimeter();
		circle2.displayValue();
		

	}

}
