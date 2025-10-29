 package inf4067;
 public class Rectangle implements Shape {
	private double height;
	private double width;

	public Rectangle(double height,double width){
		this.height=height;
		this.width=width;
	}
	public double getHeight(){return this.height;}
	public double getWidth(){return this.width;}
	public String toString(){return "\nRectangle de long: "+this.width +" et de lar: "+this.height;}

	@Override
	public double calculateArea(){
		return this.width*this.height;
	}
}
