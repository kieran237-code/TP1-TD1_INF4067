abstract class DecorateurFenetre implements Fenetre {
    protected Fenetre fenetreDecoree; 
    
    public DecorateurFenetre(Fenetre fenetre) {
        this.fenetreDecoree = fenetre;
    }

    @Override
    public void dessiner() {
        fenetreDecoree.dessiner();
    }

    @Override
    public void decrire() {
        fenetreDecoree.decrire();
    }
}