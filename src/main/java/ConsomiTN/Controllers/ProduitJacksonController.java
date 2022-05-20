package ConsomiTN.Controllers;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.persistence.DiscriminatorColumn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

import ConsomiTN.Entities.Produit;
import ConsomiTN.Exception.ProduitNotFoundException;
import ConsomiTN.Services.ProduitService;
@RestController
@RequestMapping(value ="/jacksonfilter/produit")
@Validated






public class ProduitJacksonController {
	@Autowired
	private ProduitService produitService;

	@GetMapping("/{id}")
	
	public MappingJacksonValue getProduitById(@PathVariable("id") Long id){
		try {
			Optional<Produit> produitOptional =  produitService.getProduitById(id);
			Produit produit = produitOptional.get();
			Set<String> fields =new HashSet<String>();
			fields.add("idProduit");
			fields.add("nomProduit");
			FilterProvider filterProvider = new SimpleFilterProvider().addFilter("produitFilter",SimpleBeanPropertyFilter.filterOutAllExcept(fields));
		MappingJacksonValue mapper = new MappingJacksonValue(produit);
			mapper.setFilters(filterProvider);
			return mapper;
		}catch (ProduitNotFoundException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, ex.getMessage());
		}
	}

}
