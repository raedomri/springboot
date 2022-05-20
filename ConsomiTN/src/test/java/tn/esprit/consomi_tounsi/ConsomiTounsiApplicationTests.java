package tn.esprit.consomi_tounsi;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ConsomiTN.Entities.Categorie;
import ConsomiTN.Entities.Produit;
import ConsomiTN.Repositories.CategorieRepository;
import ConsomiTN.Repositories.ProduitRepository;
import ConsomiTN.Services.ProduitService;


@SpringBootTest
class ConsomiTounsiApplicationTests {

	
	  @Autowired
	  private ProduitRepository produitRepository ;
	  private ProduitService produitService ;
	  @Test
	  public void testCreateProduit() {
		 // Produit prod = new Produit("pc3","dell","pc",5.5,5.55);
		  //produitRepository.save(prod);
	  }
	  @Test
	  public void testFindProduit() {
		  Produit p =  produitRepository.findById(1L).get();
		  System.out.println(p);
	  }
	  @Test
	  public void testUpdateProduit() {
		  Produit p =  produitRepository.findById(1L).get();
		  p.setPrixProduit(8.5);
		  produitRepository.save(p);
		  System.out.println(p);
	  }
	  @Test
	  public void testDeleteProduit() {
		produitRepository.deleteById(1L);
	  }
	  @Test
	  public void testFindAllProduits() {
		  List<Produit> prods = (List<Produit>) produitRepository.findAll();
		  
		  for (Produit p:prods )
			  System.out.println(p);
		
	  }

	  @Autowired
	  private CategorieRepository categorieRepository ;
	  @Test
	  public void testCreateCategorie() {
		 // categorie prod = new Categorie("pc3","dell","pc",5.5,5.55);
		  //categorieRepository.save(c);
	  }
	  @Test
	  public void testFindCategorie() {
		  Categorie c =  categorieRepository.findById(1L).get();
		  System.out.println(c);
	  }
	  @Test
	  public void testUpdateCategorie() {
		  Categorie c =  categorieRepository.findById(1L).get();
		 
		 // produitRepository.save(c);
		  System.out.println(c);
	  }
	  @Test
	  public void testDeleteCategorie() {
		  categorieRepository.deleteById(1L);
	  }
	  @Test
	  public void testFindAllCategorie() {
		  List<Categorie> cat = (List<Categorie>) categorieRepository.findAll();
		  
		  for (Categorie c:cat )
			  System.out.println(c);
		
	  }
	 

}
