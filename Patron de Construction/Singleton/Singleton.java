public final class Singleton{
    private static Singleton instance = null;
    private int x;
    private int y;
    private String nom ;

    // Constructeur 1 
    private Singleton(){
        super();
    }

    // Constructeur 2 
    private Singleton(int x , int y ){
        this.x=x;
        this.y=y;
    }

    //Constructeur 3
    private Singleton( int x , int y , String nom){
        this.x=x;
        this.y=y;
        this.nom ="Adama";
    }

    public static Singleton getInstance() {
        if (instance == null){
            instance = new
            Singleton();
        }
        return instance;
    }

    public static Singleton getInstance(int x , int y){
        if(instance == null){
            instance = new Singleton(x , y) ;

        }
        return instance ;
    }

    public int somme(int x , int y ){
        return x+y ;
    }

    public float moyenne (int x , int y) {
        return somme(x,y)/2;
    }

    public void affiche(){
        System.out.println("\n Je suis une Instance dont  mes valeurs sont: x="+ this.x + "et y =" + this.y);
    }


    public static Singleton getInstance(int x , int y , String nom ){
        if(instance == null){
            instance = new Singleton(x , y) ;

        }
        return instance ;
    }

    public int somme(int x , int y , String nom ){
        return x+y ;
    }

    public float moyenne (int x , int y , String nom) {
        return somme(x,y)/2;
    }

    public void affiche1(){
        System.out.println("\n Je suis une Instance dont mon nom est" + this.nom + " et  mes valeurs sont: x="+ this.x + "et y =" + this.y);
    }
    @Override 
    public Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }
}

