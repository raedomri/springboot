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

import ConsomiTN.Entities.Produit;
import ConsomiTN.Entities.Publicite;
import ConsomiTN.Services.PubliciteService;
@CrossOrigin(origins="*")
@RestController
public class PubliciteController {
	@Autowired
	PubliciteService publiciteService;
	@GetMapping("/Publicite")
	@ResponseBody
	public List<Publicite> getAllPublicite(){
		List<Publicite> list = publiciteService.getAllPublicite();
		return list;
	}
	@PostMapping("/savePublicite")
	@ResponseBody
	public Publicite savePublicite(@RequestBody Publicite P)
	{
		return publiciteService.savePublicite(P);
	}
@DeleteMapping("/deletePublicite/{id}")
@ResponseBody
public void deletePublicite(@PathVariable("id") Long idPublicite){
	publiciteService.deletePubliciteById(idPublicite);
}
@PutMapping("/updatePublicite")
@ResponseBody
public Publicite updatePublicite(@RequestBody Publicite publicite) {
    return publiciteService.updatePublicite(publicite);
}
@PutMapping("/AffecterEventsPublicite/{idEvents}/{idPublicite}")
@ResponseBody
public void AffecterEventsPublicite(@PathVariable("idEvents") long idEvents , @PathVariable("idPublicite") Long idPublicite) {
	publiciteService.AffecterEventsPublicite(idEvents, idPublicite);
}
}


