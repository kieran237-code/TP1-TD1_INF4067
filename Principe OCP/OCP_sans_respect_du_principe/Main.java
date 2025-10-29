import inf4067.*;
public class Main{
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(3.5,4.8);
		System.out.println(rectangle);
		System.out.println("sa surface est de : "+AreaCalculator.calculateArea(rectangle));


		Circle circle = new Circle (2);
		System.out.println(circle);
		System.out.println("sa surface est de : "+AreaCalculator.calculateArea(circle));


	}
}