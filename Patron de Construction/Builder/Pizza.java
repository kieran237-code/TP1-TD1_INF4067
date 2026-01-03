class Pizza {
    private String pate = "";
    private String sauce = "";
    private String garniture = "";

    public void setPate(String pate) {
        this.pate = pate;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setGarniture(String garniture) {
        this.garniture = garniture;
    }

    public void print() {
        System.out.println(this.toString());
        System.out.println("Pate =" + pate + "\n Sauce =" + sauce + "\n Garniture =" + garniture);
    }
}

abstract class MonteurPizza {

    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void creerNouvellePizza() {
        pizza = new Pizza();
    }

    public abstract void monterPate();

    public abstract void monterSauce();

    public abstract void monterGarniture();
}

class MonteurPizzaReine extends MonteurPizza {
    public void monterPate() {
        pizza.setPate("croisée");
    }

    public void monterSauce() {
        pizza.setSauce("douce");
    }

    public void monterGarniture() {
        pizza.setGarniture("jambon+champignon");
    }
}

/* MonteurConcret */
class MonteurPizzaPiquante extends MonteurPizza {
    public void monterPate() {
        pizza.setPate("feuilletée");
    }

    public void monterSauce() {
        pizza.setSauce("piquante");
    }

    public void monterGarniture() {
        pizza.setGarniture("pepperoni+salami");
    }
}
class Directeur {
    private MonteurPizza monteurPizza;

   
    public void setMonteurPizza(MonteurPizza mp) {
        this.monteurPizza = mp;
    }
    public Pizza getPizza() {
        return monteurPizza.getPizza();
    }

    public void construirePizza() {
        monteurPizza.creerNouvellePizza();
        monteurPizza.monterPate();
        monteurPizza.monterSauce();
        monteurPizza.monterGarniture();
    }
}

