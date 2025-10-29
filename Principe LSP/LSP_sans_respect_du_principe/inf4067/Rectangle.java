package inf4067;
public class Rectangle {
	protected double height;
	protected double width;

	public void setHeight(double height){
	 this.height=height;
	}
	public void setWidth( double width){ 
		this.width = width;
	}
	public double getArea(){return  this.height*this.width;}
}
