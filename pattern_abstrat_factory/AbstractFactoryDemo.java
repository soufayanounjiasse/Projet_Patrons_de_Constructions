// ========== Produits Abstraits ==========

// Produit abstrait A
abstract class ProduitA {
    public abstract void methodeA();
}

// Produit abstrait B
abstract class ProduitB {
    public abstract void methodeB();
}

// ========== Produits Concrets Famille 1 ==========

// Produit concret A1
class ProduitA1 extends ProduitA {
    @Override
    public void methodeA() {
        System.out.println("Méthode A du Produit A1");
    }
}

// Produit concret B1
class ProduitB1 extends ProduitB {
    @Override
    public void methodeB() {
        System.out.println("Méthode B du Produit B1");
    }
}

// ========== Produits Concrets Famille 2 ==========

// Produit concret A2
class ProduitA2 extends ProduitA {
    @Override
    public void methodeA() {
        System.out.println("Méthode A du Produit A2");
    }
}

// Produit concret B2
class ProduitB2 extends ProduitB {
    @Override
    public void methodeB() {
        System.out.println("Méthode B du Produit B2");
    }
}

// ========== Fabrique Abstraite ==========

abstract class FabriqueAbstraite {
    public abstract ProduitA creerProduitA();
    public abstract ProduitB creerProduitB();
}

// ========== Fabriques Concrètes ==========

// Fabrique concrète 1 - crée les produits de la famille 1
class FabriqueConcrete1 extends FabriqueAbstraite {
    @Override
    public ProduitA creerProduitA() {
        return new ProduitA1();
    }
    
    @Override
    public ProduitB creerProduitB() {
        return new ProduitB1();
    }
}

// Fabrique concrète 2 - crée les produits de la famille 2
class FabriqueConcrete2 extends FabriqueAbstraite {
    @Override
    public ProduitA creerProduitA() {
        return new ProduitA2();
    }
    
    @Override
    public ProduitB creerProduitB() {
        return new ProduitB2();
    }
}

// ========== Client ==========

class Client {
    private ProduitA produitA;
    private ProduitB produitB;
    
    // Le client reçoit une fabrique et utilise ses produits
    public Client(FabriqueAbstraite fabrique) {
        this.produitA = fabrique.creerProduitA();
        this.produitB = fabrique.creerProduitB();
    }
    
    public void main(String[] args) {
        produitA.methodeA();
        produitB.methodeB();
    }
}

// ========== Programme Principal (Démonstration) ==========

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        System.out.println("=== Utilisation de la Fabrique Concrète 1 ===");
        FabriqueAbstraite fabrique1 = new FabriqueConcrete1();
        Client client1 = new Client(fabrique1);
        client1.main(null);
        
        System.out.println("\n=== Utilisation de la Fabrique Concrète 2 ===");
        FabriqueAbstraite fabrique2 = new FabriqueConcrete2();
        Client client2 = new Client(fabrique2);
        client2.main(null);
    }
}