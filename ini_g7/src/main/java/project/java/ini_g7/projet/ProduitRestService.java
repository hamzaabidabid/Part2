package project.java.ini_g7.projet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import project.java.ini_g7.main.Reps;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProduitRestService {
    @Autowired
    private Reps R;

    @GetMapping("/produits")
    public List<produit> produits(){
        return R.findAll();
    }
    @GetMapping("/produits/{id}")
    public produit findProduit(@PathVariable long id){
     produit Pro =R.findById(id).get();
        return Pro;
    }
}
