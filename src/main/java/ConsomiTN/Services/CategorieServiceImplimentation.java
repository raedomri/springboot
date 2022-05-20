package ConsomiTN.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ConsomiTN.Entities.Categorie;
import ConsomiTN.Entities.Produit;
import ConsomiTN.Repositories.CategorieRepository;
import ConsomiTN.Repositories.ProduitRepository;


@Service
public class CategorieServiceImplimentation implements CategorieService {
	 @Autowired
	  
	  CategorieRepository categorieRepository;
     @Autowired
     ProduitRepository produitRepository;
	
	
	@Override
	public Categorie saveCategorie(Categorie c) {
		
		return categorieRepository .save(c);
	}

	@Override
	 public  Categorie updateCategorie(Categorie categorie) {
		
        return categorieRepository.save(categorie);
    }

	@Override
	public void deleteCategorie(Categorie c) {
		categorieRepository.delete(c);
		
	}

	@Override
	public void deleteCategorieById(Long id) {
		
		categorieRepository.deleteById(id);
	}

	@Override
	public Categorie getCategorie(Long id) {
		
		return categorieRepository.findById(id).get();
	}

	@Override
	public List<Categorie> getAllCategorie() {
		
		return (List<Categorie>)categorieRepository.findAll();
	}
	
     @Override
 public void AffecterProduitCategorie(Long idProduit, Long idCategorie) {
    	 Categorie categorieEntity = categorieRepository.findById(idCategorie).get(); 
    	 Produit produitEntity = produitRepository.findById(idProduit).get();
    	 produitEntity.setCategorie(categorieEntity);
    	 produitRepository.save(produitEntity);
    }
}
