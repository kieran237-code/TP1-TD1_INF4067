import inf4067.*;
public class Main {
	public static void main(String[] args) {
		Database database;
		database = new MySQLDatabase();
		OrderProcessor order = new OrderProcessor(database);
		order.processOrder("Donnée à sauvegarder");

		database = new MongoBDDatabase();
		OrderProcessor order2 = new OrderProcessor(database);
		order2.processOrder("Donnée à sauvegarder");
	}
}
