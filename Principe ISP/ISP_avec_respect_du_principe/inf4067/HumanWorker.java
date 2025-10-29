package inf4067;
public class HumanWorker implements Eater {
	@Override
	public  void work(){
		System.out.println("Les humains travaillent");
	}

	@Override
	public void eat(){
		System.out.println("Les humains mangent");
	}
}