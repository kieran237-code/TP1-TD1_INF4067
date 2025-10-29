import inf4067.*;
public class Main{
	public static void main(String[] args) {
		Shape rectangle = new Rectangle(4,5);
		System.out.println("sa surface du rectangle est de : "+rectangle.getArea());


		Shape square = new Square(4);
		System.out.println("sa surface carré est de : "+square.getArea());


	}
}