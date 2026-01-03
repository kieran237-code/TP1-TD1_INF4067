package Factory;
// fabrique concrete 1 -------------------
public class ProduitFactory1 extends ProduitFactory {
    protected ProduitA createProduitA(){
        return new ProduitA1();
    }
}
