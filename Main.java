// Classe principale pour tester le pattern
class Main {
    public static void main(String[] args) {
        // Utilisation de la Factory pour créer des produits
        
        // Création d'un produit de type A
        Produit produitA = Factory.createProduit("A");
        if (produitA != null) {
            produitA.methodeproduit();
        }
        
        System.out.println("\n-------------------\n");
        
        // Création d'un produit de type B
        Produit produitB = Factory.createProduit("B");
        if (produitB != null) {
            produitB.methodeproduit();
        }
    }
}