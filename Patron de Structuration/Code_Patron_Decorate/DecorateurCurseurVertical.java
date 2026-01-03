class DecorateurCurseurVertical extends DecorateurFenetre {
    public DecorateurCurseurVertical(Fenetre fenetre) {
        super(fenetre);
    }

    @Override
    public void dessiner() {
        super.dessiner();
        dessinerCurseurVertical();
    }

    private void dessinerCurseurVertical() {
        System.out.println(" + Ajout d'un curseur vertical.");
    }

    @Override
    public void decrire() {
        super.decrire(); 
        System.out.print(", avec curseur vertical"); 
    }
}