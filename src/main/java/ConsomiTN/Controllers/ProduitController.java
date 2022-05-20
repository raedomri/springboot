package ConsomiTN.Controllers;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import ConsomiTN.Entities.Categorie;
import ConsomiTN.Entities.Produit;
import ConsomiTN.Exception.ProduitNotFoundException;
import ConsomiTN.Services.ProduitService;
@CrossOrigin(origins="*")
@RestController
public class ProduitController {
	@Autowired
	ProduitService produitService;
	@GetMapping("/Produit")
	@ResponseBody
	public List<Produit> getAllProduits(){
		List<Produit> list = produitService.getAllProduits();
		return list;
	}
	@PostMapping("/saveProduit")
	@ResponseBody
	public Produit saveProduit(@RequestBody Produit p)
	{
		return produitService.saveProduit(p);
	}
@DeleteMapping("/deleteProduit/{id}")
@ResponseBody
public void deleteProduit(@PathVariable("id") Long idProduit){
	produitService.deleteProduitById(idProduit);
}
@GetMapping("/Produit/{id}")

public Optional<Produit> getProduitById(@PathVariable("id") Long id){
	try {
		return  produitService.getProduitById(id);
		
	}catch (ProduitNotFoundException ex) {
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, ex.getMessage());
	}
	
	
	}
@PutMapping("/updateProduit")
@ResponseBody
public Produit updateProduit(@RequestBody Produit produit) {
    return produitService.updateProduit(produit);
}
@GetMapping("/produit/{pageNumber}/{pageSize}")
public List<Produit> findPagination(@PathVariable int pageNumber ,@PathVariable int pageSize){
	return (List<Produit>) produitService.findPagination(pageNumber, pageSize);
}


/*
 * @GetMapping("/Search/{nomProduit}") public ResponseEntity<?>
 * searchByNomProduit(@PathVariable String nomProduit,@PageableDefault(sort
 * ="nomProduit", direction = Sort.Direction.ASC)Pageable pageable){ <Produit>
 * produitPage = produitService.findAllNomProduit( nomProduit, pageable) ; if
 * (produitPage.isEmpty()) { return new ResponseEntity<>(HttpStatus.NO_CONTENT);
 * 
 * } return new ResponseEntity<>(produitPage,HttpStatus.OK);
 * 
 * }
 */
 
}
