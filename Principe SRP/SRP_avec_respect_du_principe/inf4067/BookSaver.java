package inf4067;

public class BookSaver {
	public static void saveToDatabase(BookSRP book){
		System.out.println("Sauvegarde du livre " +book.getTitle()+" en base de donnée...");
	}

	public static void saveToFile(BookSRP book,String fileName){
		System.out.println("Sauvegarde du livre "+book.getTitle()+" dans "+fileName);
	}
}
