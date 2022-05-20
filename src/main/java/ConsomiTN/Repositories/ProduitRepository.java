package ConsomiTN.Repositories;













import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ConsomiTN.Entities.Produit;

@EnableJpaRepositories
public interface ProduitRepository extends JpaRepository<Produit, Long> {

	
	
	

	

			

			/*
			 * List<Produit> findAllNomProduit(String nomProduit, Pageable pageable);
			 * 
			 * @Query("SELECT C FROM Produit AS C.nomProduit LIKE CONCAT ('%',:nomProduit,'%')"
			 * )
			 * 
			 * List<Produit> findByNomProduitQuery(@Param("nomProduit")String nomProduit,
			 * Pageable pageable);
			 * 
			 */

	

	


}
