package ConsomiTN.Entities;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;



//import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Categorie  {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idCategorie;
	
	private String nomCategorie;
	
	private String descriptionCategorie;
	
	 @OneToMany(mappedBy="categorie")
		private List<Produit> produit;
	
	
	
	public Long getIdCategorie() {
		return idCategorie;
	}
	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}
	public String getNomCategorie() {
		return nomCategorie;
	}
	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}
	public String getDescriptionCategorie() {
		return descriptionCategorie;
	}
	public void setDescriptionCategorie(String descriptionCategorie) {
		this.descriptionCategorie = descriptionCategorie;
	}
	public Categorie() {
		super();
		
	}
	public Categorie(Long idCategorie, String nomCategorie, String descriptionCategorie) {
		super();
		this.idCategorie = idCategorie;
		this.nomCategorie = nomCategorie;
		this.descriptionCategorie = descriptionCategorie;
	}
	@Override
	public String toString() {
		return "Categorie [idCategorie=" + idCategorie + ", nomCategorie=" + nomCategorie + ", descriptionCategorie="
				+ descriptionCategorie + "]";
	}
	

}
