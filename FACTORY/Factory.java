package FACTORY;
// Classe Factory (Fabrique)

class Factory {
    
    // Méthode factory pour créer des produits selon le type
    public static Produit createProduit(String type) {
        if (type.equalsIgnoreCase("A")) {
            return new ProduitA();
        } else if (type.equalsIgnoreCase("B")) {
            return new ProduitB();
        }
        return null;
    }
}