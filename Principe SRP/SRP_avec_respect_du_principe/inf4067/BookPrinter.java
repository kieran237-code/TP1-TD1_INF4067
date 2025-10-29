package inf4067;
public class BookPrinter {
    //   Afficher le livre normalement
	public static void printToScreen(BookSRP book){
		System.out.println("=== Print To Screen ===");
		System.out.println("Titre: "+book.getTitle()+"\n"+"Auteur: "+book.getAuthor()+"\n"+"Titre: "+book.getTitle());
	}

	//  Afficher le livre avec des balises HTML
	public static void printToHtml(BookSRP book){
		System.out.println("=== Print To HTML ===");
		System.out.println("<h1>"+book.getTitle()+"</h1>\n"+"<h2>Par "+book.getAuthor()+"</h2>\n"+"<p>"+book.getTitle()+"</p>");

	}
}
