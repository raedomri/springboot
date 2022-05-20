package ConsomiTN.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ConsomiTN.Entities.Produit;

public interface ProduitService {
	Produit saveProduit(Produit P);
	Produit updateProduit(Produit P);
	void deleteProduit (Produit P);
	void deleteProduitById (Long id);
	Produit getProduit(Long id);
	List<Produit> getAllProduits();
	Optional<Produit> getProduitById(Long id);
	Page<Produit> findPagination(int pageNumber , int pageSize);
	
	
	

}
