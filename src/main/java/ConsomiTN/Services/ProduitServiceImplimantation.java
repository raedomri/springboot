package ConsomiTN.Services;




import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import ConsomiTN.Entities.Produit;
import ConsomiTN.Repositories.ProduitRepository;

  @Service
public class ProduitServiceImplimantation implements ProduitService{
	  @Autowired
	  
	  ProduitRepository produitRepository;
	  ProduitService produitService;

	
	
	@Override
	public Produit saveProduit(Produit p) {
		
		return produitRepository .save(p);
	}

	@Override
	public Produit updateProduit(Produit p) {
		
		return produitRepository.save(p);
	}

	@Override
	public void deleteProduit(Produit p) {
		produitRepository.delete(p);
		
	}

	@Override
	public void deleteProduitById(Long id) {
		
		produitRepository.deleteById(id);
	}
	@Override
	public Optional<Produit> getProduitById(Long id) {
		
		return Optional.ofNullable(produitRepository.findById(id).get());
	}

	@Override
	public Produit getProduit(Long id) {
		
		return produitRepository.findById(id).get();
	}

	@Override
	public List<Produit> getAllProduits() {
		
		return (List<Produit>) produitRepository.findAll();
	}
	/*
	 * @Override public List<Produit> findPagination(int pageNumber , int pageSize){
	 * Pageable paging = PageRequest.of(pageNumber,pageSize); Page<Produit>
	 * pageResult = produitRepository.findAll(paging); return pageResult.toList();
	 * 
	 * }
	 */
	/*
	 * @Override public List<Produit> findAllNomProduit(Produit P){ return
	 * produitRepository.findAllNomProduit(Produit P); }
	 */

	@Override
	public Page<Produit> findPagination(int pageNumber, int pageSize) {
		
		return null;
	}
	
}
