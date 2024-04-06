package project.java.ini_g7.main;
import org.springframework.stereotype.Repository;
import project.java.ini_g7.projet.produit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
@Repository
public interface Reps extends JpaRepository<produit , Long> {
List<produit> findByNomContains(String N);
    List<produit> findAllById(Long id);
}
