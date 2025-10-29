import inf4067 .*;
public class Main {
    public static void main(String[] args) {
        Book book = new Book("Les principes SOLID" , "Etudiants de M1_GL","Revision des principes SOLID");
        book.printToScreen();
        book.saveToDatabase();
        book.emprunter("Marcial");
    }
}