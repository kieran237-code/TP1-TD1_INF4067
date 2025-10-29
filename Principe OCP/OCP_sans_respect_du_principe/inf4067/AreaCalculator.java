package inf4067;


public class AreaCalculator {
	public static double calculateArea( Object shape){
		if(shape instanceof Rectangle){
			Rectangle rectangle= (Rectangle) shape;
			return rectangle.getWidth()* rectangle.getHeight();
		}else if(shape instanceof Circle){
			Circle circle =(Circle)shape;
			return Math.PI *circle.getRadius() * circle.getRadius();
		}
		throw new IllegalArgumentException("Unknown shape");
	}
}