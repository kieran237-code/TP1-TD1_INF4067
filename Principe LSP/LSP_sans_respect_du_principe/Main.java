import inf4067.*;
public class Main{
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.setWidth(5);
		rectangle.setHeight(4);
		System.out.println("sa surface du rectangle est de : "+rectangle.getArea());


		Square square = new Square();
		square.setWidth(5);
		square.setHeight(4);
		System.out.println("sa surface carré est de : "+square.getArea());


	}
}