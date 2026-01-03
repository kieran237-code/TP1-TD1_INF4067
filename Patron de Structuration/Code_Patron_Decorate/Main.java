public class Main {
    public static void main(String[] args) {
        
        Fenetre f = new FenetreSimple();
        f = new DecorateurCurseurVertical(f);
        f = new DecorateurCurseurHorizontal(f);

        // Affichage de la description
        System.out.print("Configuration : ");
        f.decrire(); 

        System.out.println("\nAction de dessin :");
        f.dessiner();
    }
}