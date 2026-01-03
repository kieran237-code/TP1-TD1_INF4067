import java.util.ArrayList;
import java.util.List;

// 1. Le Composant Abstrait
abstract class SystemFichier {
    protected String nom;
    protected String type;

    public SystemFichier(String nom, String type) {
        this.nom = nom;
        this.type = type;
    }

    public abstract void decrire();
    public abstract void ajouter(SystemFichier e);
    public abstract void supprimer(SystemFichier e);
    public abstract SystemFichier obtenir(int i);
}

// 2. La Feuille (Fichier)
class Fichier extends SystemFichier {
    public Fichier(String nom, String type) {
        super(nom, type); // type sera "txt" ou "pdf"
    }

    @Override
    public void decrire() {
        System.out.println("Fichier: " + nom + " [Type: " + type + "]");
    }

    // Un fichier ne peut pas contenir d'éléments
    @Override 
    public void ajouter(SystemFichier e) { 
        /* Optionnel: lever une exception ou afficher une erreur */ 
    }
    
    @Override 
    public void supprimer(SystemFichier e) { }
    
    @Override 
    public SystemFichier obtenir(int i) { 
        return null; 
    }
}

// 3. Le Composite (Dossier)
class Dossier extends SystemFichier {
    private List<SystemFichier> enfants = new ArrayList<>();

    public Dossier(String nom) {
        super(nom, "dossier");
    }

    @Override
    public void decrire() {
        System.out.println("\n--- Dossier: " + nom + " ---");
        for (SystemFichier e : enfants) {
            e.decrire(); // Appel récursif (Cœur du patron Composite)
        }
    }

    @Override
    public void ajouter(SystemFichier e) {
        enfants.add(e);
    }

    @Override
    public void supprimer(SystemFichier e) {
        enfants.remove(e);
    }

    @Override
    public SystemFichier obtenir(int i) {
        if (i >= 0 && i < enfants.size()) {
            return enfants.get(i);
        }
        return null;
    }
}

// Exemple d'utilisation
public class Main {
    public static void main(String[] args) {
        // Création des fichiers
        SystemFichier f1 = new Fichier("notes", "txt");
        SystemFichier f2 = new Fichier("rapport", "pdf");
        
        // Création des dossiers
        Dossier root = new Dossier("C:");
        Dossier docs = new Dossier("MesDocuments");
        
        // Construction de l'arbre
        docs.ajouter(f1);
        docs.ajouter(f2);
        root.ajouter(docs);
        root.ajouter(new Fichier("config", "txt"));

        // Affichage uniforme via l'interface SystemFichier
        root.decrire();
    }
}
