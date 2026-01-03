public class Client {
    public static void main(String[] args){
        ProduitFactory produitFactory = new ProduitFactory();

        ProduitA produitA = null;

        produitA = produitFactory.geProduitA(ProduitFactory.TYPE_PRODUITA1);
        produitA.methodeA();

        produitA = produitFactory.geProduitA(ProduitFactory.TYPE_PRODUITA2);
        produitA.methodeA();

        produitA = produitFactory.geProduitA(ProduitFactory.TYPE_PRODUITA3);
        produitA.methodeA();

        produitA = produitFactory.geProduitA(3);
        produitA.methodeA();

    }
}
