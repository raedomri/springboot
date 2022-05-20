package ConsomiTN.Services;

import java.util.List;

import ConsomiTN.Entities.Categorie;

public interface CategorieService {
	Categorie saveCategorie(Categorie c);
	Categorie updateCategorie(Categorie c);
	void deleteCategorie (Categorie c);
	void deleteCategorieById (Long id);
	Categorie getCategorie(Long id);
	List<Categorie> getAllCategorie();
	public void AffecterProduitCategorie(Long idProduit, Long idCategorie);
}
