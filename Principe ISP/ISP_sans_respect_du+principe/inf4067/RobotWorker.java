package inf4067;
public class RobotWorker implements Worker{
	@Override
	public  void work(){
		System.out.println("Les robots traviallent sans fatigue");
	}

	@Override
	public  void eat(){
		System.out.println("Les robots ne peuvent pas manger");
		throw new UnsupportedOperationException("Les robots ne mangent pas");
	}

}