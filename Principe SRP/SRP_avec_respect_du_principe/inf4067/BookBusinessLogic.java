package inf4067;
public class BookBusinessLogic{
	public static void emprunter(BookSRP book,String lecteur){
		System.out.println("Emprunt du livre '"+ book.getTitle()+"' par "+lecteur);
	}

	public static void rendre(BookSRP book,String fileName){
		System.out.println("restitution du livre "+book.getTitle()+" par "+fileName);
	}
}