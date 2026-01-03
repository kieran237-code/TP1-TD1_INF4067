// Interface
interface ICarre {
    void setCote(double cote);
    double calculerAire();
    double calculerPerimetre();
    void afficherResultats();
}

// Adaptee
class Rectangle {
    private double largeur, hauteur;

    public void definirDimensions(double l, double h) {
        this.largeur = l;
        this.hauteur = h;
    }

    public double calculerAireRectangle() { return largeur * hauteur; }
    public double calculerPerimetreRectangle() { return 2 * (largeur + hauteur); }
}

// Adapter
class RectangleAdapter implements ICarre {
    private Rectangle rectangle;

    public RectangleAdapter(Rectangle r) { this.rectangle = r; }

    @Override
    public void setCote(double cote) {
        // Un carré est un rectangle où largeur = hauteur
        rectangle.definirDimensions(cote, cote);
    }

    @Override
    public double calculerAire() {
        return rectangle.calculerAireRectangle();
    }

    @Override
    public double calculerPerimetre() {
        return rectangle.calculerPerimetreRectangle();
    }

    @Override
    public void afficherResultats() {
        System.out.println("Aire: " + calculerAire());
        System.out.println("Périmètre: " + calculerPerimetre());
    }
}

public class Main {
    public static void main(String[] args) {
        // --- TEST DU CARRÉ (via l'Adaptateur) ---
        System.out.println("--- Test Carré (Côté 7) ---");
        Rectangle rectPourCarre = new Rectangle();
        ICarre monCarre = new RectangleAdapter(rectPourCarre);
        
        monCarre.setCote(7); 
        monCarre.afficherResultats();

        // --- TEST DU RECTANGLE (Directement) ---
        System.out.println("\n--- Test Rectangle (4 x 3) ---");
        Rectangle monRectangle = new Rectangle();
        monRectangle.definirDimensions(4, 3);
        
        System.out.println("Aire du rectangle : " + monRectangle.calculerAireRectangle());
        System.out.println("Périmètre du rectangle : " + monRectangle.calculerPerimetreRectangle());
    }
}
