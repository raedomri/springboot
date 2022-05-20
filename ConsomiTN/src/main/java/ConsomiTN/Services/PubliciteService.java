package ConsomiTN.Services;

import java.util.List;

import ConsomiTN.Entities.Publicite;

public interface PubliciteService {
	Publicite savePublicite(Publicite P);
	Publicite updatePublicite(Publicite P);
	void deletePublicite(Publicite P);
	void deletePubliciteById (Long id);
	Publicite getPublicite(Long id);
	List<Publicite> getAllPublicite();
	public void AffecterEventsPublicite(Long idEvents, Long idPublicite);
	
	
}
