package Factory;

// fabrique concrete 3 -------------------
public class ProduitFactory3 extends ProduitFactory {
    protected ProduitA createProduitA(){
        return new ProduitA3();
    }
}

