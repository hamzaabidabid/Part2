package project.java.ini_g7.projet;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class produit {

    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private  double prix ;
    private int quantity;




}
