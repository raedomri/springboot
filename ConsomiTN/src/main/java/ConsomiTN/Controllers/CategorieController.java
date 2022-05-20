package ConsomiTN.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ConsomiTN.Entities.Categorie;
import ConsomiTN.Services.CategorieService;

@CrossOrigin(origins="*")
@RestController
public class CategorieController {
	
		@Autowired
		CategorieService categorieService;
		@GetMapping("/Categorie")
		@ResponseBody
		public List<Categorie> getAllCategorie(){
			List<Categorie> list = categorieService.getAllCategorie();
			return list;
		}
		@PostMapping("/saveCategorie")
		@ResponseBody
		public  Categorie saveCategorie(@RequestBody Categorie c)
		{
			return categorieService.saveCategorie(c);
		}
	@DeleteMapping("/deleteCategorie/{id}")
	@ResponseBody
	public void deleteCategorie(@PathVariable("id") Long idCategorie){
		categorieService.deleteCategorieById(idCategorie);
	}
	@PutMapping("/updateCategorie")
	@ResponseBody
	public Categorie updateCategorie(@RequestBody Categorie categorie) {
        return categorieService.updateCategorie(categorie);
	}
	@PutMapping("/AffecterProduitCategorie/{idProduit}/{idCategorie}")
	@ResponseBody
	public void AffecterProduitCategorie(@PathVariable("idProduit") long idProduit , @PathVariable("idCategorie") Long idCategorie) {
		categorieService.AffecterProduitCategorie(idProduit, idCategorie);
	}
	
	
}
