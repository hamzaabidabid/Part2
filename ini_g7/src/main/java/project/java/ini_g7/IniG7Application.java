package project.java.ini_g7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import project.java.ini_g7.main.Reps;
import project.java.ini_g7.projet.produit;

import java.util.List;

@SpringBootApplication
public class IniG7Application implements CommandLineRunner {

    @Autowired
    private Reps Re;

    public static void main(String[] args) {
        SpringApplication.run(IniG7Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

//        produit newProduct = new produit(null, "Newproduit", 100, 10);
//        Re.save(newProduct);
//        System.out.println("Produit ajouté : " + newProduct);

        System.out.println("*************************");
        Long FindProduitById = 19L;
        produit pro = Re.findById(FindProduitById).orElse(null);

        if (pro != null) {

            System.out.println("Produit trouvé : " + pro);
        } else {
            System.out.println("Produit non trouvé !");
        }
        System.out.println("********************************");
        List<produit> productsToUpdate = Re.findAllById(17L);
        if (!productsToUpdate.isEmpty()) {
            produit productToUpdate = productsToUpdate.get(0);
            productToUpdate.setNom("Produit mis à jour");
            productToUpdate.setPrix(150);
            productToUpdate.setQuantity(20);
            Re.save(productToUpdate);
            System.out.println("Produit mis à jour : " + productToUpdate);
        } else {
            System.out.println("Produit non trouvé !");
        }

        System.out.println("*************************");
        List<produit> productsToDelete = Re.findAllById(24L);
        if (!productsToDelete.isEmpty()) {
            produit productToDelete = productsToDelete.get(0);
            Re.delete(productToDelete);
            System.out.println("Produit supprimé : " + productToDelete);
        } else {
            System.out.println("Produit non trouvé !");
        }

        System.out.println("*************************");
        List<produit> products = Re.findAll();
        System.out.println("Liste des produits : ");
        products.forEach(System.out::println);
    }
}
