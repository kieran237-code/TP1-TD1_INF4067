package inf4067;
public class MongoBDDatabase implements Database{
	@Override
	public void save(String data){
		System.out.println("Saving to MongoBD: "+data);
	}
}