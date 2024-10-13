package assignment_5_part_1;

public class Main 
{
	
	public static void main(String[] args) 
	{
		
		Circle circle = new Circle(5);
		Triangle triangle = new Triangle(3, 4, 5, 4);
		Rectangle rectangle = new Rectangle(5,4);
		System.out.printf("Circle Perimeter: %.2f\n", circle.perimeter());
		System.out.printf("Circle Area: %.2f\n", circle.area());
		System.out.println();
		System.out.printf("Triangle Perimeter: %.2f\n", triangle.perimeter());
		System.out.printf("Triangle Area: %.2f\n", triangle.area());
		System.out.println();
		System.out.printf("Rectangle Perimeter: %.2f\n", rectangle.perimeter());
		System.out.printf("Rectangle Area: %.2f\n", rectangle.area());
	}

}
