import inf4067.*;

public class Main{
	public static void main(String[] args) {
		BookSRP book = new BookSRP("Les principes SOLID","Etudiants de M1-GL","Révision des principes SOLID");
		
		BookPrinter.printToScreen(book);		
		BookPrinter.printToHtml(book);

		BookSaver.saveToDatabase(book);
		BookSaver.saveToFile(book,"M1 GL");

		BookBusinessLogic.emprunter(book,"Marcial");
		BookBusinessLogic.rendre(book,"Marcial");
	}
}
