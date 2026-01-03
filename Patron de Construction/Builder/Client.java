 public class Client {
    public static void main(String[] args) {
        Directeur directeur = new Directeur();

        MonteurPizza monteurReine = new MonteurPizzaReine();
        directeur.setMonteurPizza(monteurReine);
        directeur.construirePizza(); 

        Pizza pizzaReine = directeur.getPizza();
        System.out.println("--- Pizza 1 ---");
        pizzaReine.print();

        System.out.println(); 

        MonteurPizza monteurPiquant = new MonteurPizzaPiquante();
        directeur.setMonteurPizza(monteurPiquant);
        directeur.construirePizza();

        Pizza pizzaPiquante = directeur.getPizza();
        System.out.println("--- Pizza 2 ---");
        pizzaPiquante.print();
    }
} 
    

