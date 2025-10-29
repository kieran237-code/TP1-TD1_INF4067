package inf4067;
public class Circle implements Shape {
	private double radius;

	public Circle(double radius){
		this.radius=radius;
	}
	public double getRadius(){return this.radius;}
	public String toString(){ return "cercle de ray: "+this.radius;}

	@Override
	public double calculateArea(){
		return this.radius*this.radius*Math.PI;
	}
}
