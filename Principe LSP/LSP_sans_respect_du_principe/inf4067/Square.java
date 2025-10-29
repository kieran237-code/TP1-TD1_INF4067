package inf4067;
public class Square extends Rectangle {
	@Override
	public void setHeight(double height){
		super.height=height;
		super.width=height;
	}

	@Override
	public void setWidth(double width){
		super.height=width;
		super.width=width;
	}
}