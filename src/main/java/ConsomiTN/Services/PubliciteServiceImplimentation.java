package ConsomiTN.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ConsomiTN.Entities.Categorie;
import ConsomiTN.Entities.Events;
import ConsomiTN.Entities.Publicite;
import ConsomiTN.Repositories.EventsRepository;
import ConsomiTN.Repositories.PubliciteRepository;
@Service
public class PubliciteServiceImplimentation implements PubliciteService{
	 @Autowired
	  
	 PubliciteRepository publiciteRepository;
	 @Autowired
	 EventsRepository eventsRepository;

	
	
	@Override
	public  Publicite savePublicite( Publicite P) {
		
		return  publiciteRepository.save(P);
	}

	@Override
	public  Publicite updatePublicite( Publicite P) {
		
		return  publiciteRepository.save(P);
	}

	@Override
	public void deletePublicite(Publicite P) {
		publiciteRepository.delete(P);
		 
	}

	@Override
	public void deletePubliciteById(Long id) {
		
		publiciteRepository.deleteById(id);
	}

	@Override
	public Publicite getPublicite(Long id) {
		
		return publiciteRepository.findById(id).get();
	}

	@Override
	public List<Publicite> getAllPublicite() {
		
		return (List<Publicite>)publiciteRepository.findAll();
	}
	
	
	
	 public void AffecterEventsPublicite(Long idEvents, Long idPublicite) {
    	 Publicite publiciteEntity = publiciteRepository.findById(idPublicite).get(); 
    	 Events eventsEntity = eventsRepository.findById(idEvents).get();
    	 eventsEntity.setPublicite(publiciteEntity);
    	 eventsRepository.save(eventsEntity);
     }
}