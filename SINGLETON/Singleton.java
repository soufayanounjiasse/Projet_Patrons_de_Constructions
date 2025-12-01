public class Singleton {
    // ========== Attributs ==========
    
    // Instance unique du Singleton (static et private)
    private static Singleton instance;
    
    // Attributs de la classe
    private int x;
    private int y;
    
    // ========== Constructeurs Privés ==========
    
    // Constructeur par défaut (privé pour empêcher l'instanciation directe)
    private Singleton() {
        this.x = 0;
        this.y = 0;
    }
    
    // Constructeur avec paramètres (privé)
    private Singleton(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // ========== Méthode getInstance (accès à l'instance unique) ==========
    
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
    // Surcharge de getInstance avec paramètres
    public static Singleton getInstance(int x, int y) {
        if (instance == null) {
            instance = new Singleton(x, y);
        }
        return instance;
    }
    
    // ========== Méthodes Publiques ==========
    
    // Calcule la moyenne de x et y
    public float moyenne(int x, int y) {
        return (x + y) / 2.0f;
    }
    
    // Calcule la somme de x et y
    public int somme(int x, int y) {
        return x + y;
    }
    
    // Calcule le produit de x et y
    public int Produit(int x, int y) {
        return x * y;
    }
    
    // Affiche les valeurs de x et y
    public void affiche() {
        System.out.println("Singleton - x: " + this.x + ", y: " + this.y);
    }
    
    // ========== Getters et Setters ==========
    
    public int getX() {
        return x;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setY(int y) {
        this.y = y;
    }
}

// ========== Classe de Démonstration ==========

class SingletonDemo {
    public static void main(String[] args) {
        System.out.println("=== Test du Patron Singleton ===\n");
        
        // Première récupération de l'instance (création)
        Singleton s1 = Singleton.getInstance(10, 20);
        System.out.println("Instance s1 créée:");
        s1.affiche();
        
        // Tentative de création d'une deuxième instance
        // Elle retournera la même instance que s1
        Singleton s2 = Singleton.getInstance(30, 40);
        System.out.println("\nInstance s2 (devrait être la même que s1):");
        s2.affiche();
        
        // Vérification que s1 et s2 sont la même instance
        System.out.println("\ns1 == s2 ? " + (s1 == s2));
        
        // Test des méthodes
        System.out.println("\n=== Test des méthodes ===");
        System.out.println("Somme(5, 3): " + s1.somme(5, 3));
        System.out.println("Produit(5, 3): " + s1.Produit(5, 3));
        System.out.println("Moyenne(5, 3): " + s1.moyenne(5, 3));
        
        // Modification des attributs
        System.out.println("\n=== Modification via s1 ===");
        s1.setX(100);
        s1.setY(200);
        s1.affiche();
        
        // Vérification que s2 a aussi été modifié (car c'est la même instance)
        System.out.println("\nVérification via s2:");
        s2.affiche();
    }
}