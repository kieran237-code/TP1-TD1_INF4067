class DecorateurCurseurHorizontal extends DecorateurFenetre {
    public DecorateurCurseurHorizontal(Fenetre fenetre) {
        super(fenetre);
    }

    @Override
    public void dessiner() {
        super.dessiner();
        dessinerCurseurHorizontal(); 
    }

    private void dessinerCurseurHorizontal() {
        System.out.println(" + Ajout d'un curseur horizontal.");
    }

    @Override
    public void decrire() {
        super.decrire();
        System.out.print(", avec curseur horizontal");
    }
}