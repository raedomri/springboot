package ConsomiTN.Entities;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
 
//import com.fasterxml.jackson.annotation.JsonFilter;
@Entity
//@JsonFilter(value="produitFilter")
public class Produit {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idProduit;
	private String nomProduit;
	@Temporal(TemporalType.DATE)
	private Date dateExp;
	private String typeProduit;
	private Double poidProduit;
	private Double prixProduit;
	private int qte_stock;
	private String produitFile;
	private Long codeAbarre;
	
	@ManyToOne
	private Categorie categorie;
	
	

	
	public Produit() {
		super();
		
	}


	public Produit(Long idProduit,String produitFile, String nomProduit, Date dateExp, String typeProduit, Double poidProduit,
			Double prixProduit, int qte_stock, Categorie categorie, Long codeAbarre) {
		super();
		this.idProduit = idProduit;
		this.nomProduit = nomProduit;
		this.dateExp = dateExp;
		this.typeProduit = typeProduit;
		this.poidProduit = poidProduit;
		this.prixProduit = prixProduit;
		this.qte_stock = qte_stock;
		
		this.codeAbarre=codeAbarre;
		
	}


	public String getProduitFile() {
		return produitFile;
	}


	public void setProduitFile(String produitFile) {
		this.produitFile = produitFile;
	}


	public int getQte_stock() {
		return qte_stock;
	}


	public void setQte_stock(int qte_stock) {
		this.qte_stock = qte_stock;
	}


	public Date getDateExp() {
		return dateExp;
	}


	public void setDateExp(Date dateExp) {
		this.dateExp = dateExp;
	}


	


	public Long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	
	public String getTypeProduit() {
		return typeProduit;
	}
	public void setTypeProduit(String typeProduit) {
		this.typeProduit = typeProduit;
	}
	public Double getPoidProduit() {
		return poidProduit;
	}
	public void setPoidProduit(Double poidProduit) {
		this.poidProduit = poidProduit;
	}
	public Double getPrixProduit() {
		return prixProduit;
	}
	public void setPrixProduit(Double prixProduit) {
		this.prixProduit = prixProduit;
	}


	public Categorie getCategorie() {
		return categorie;
	}


	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}


	public Long getCodeAbarre() {
		return codeAbarre;
	}


	public void setCodeAbarre(Long codeAbarre) {
		this.codeAbarre = codeAbarre;
	}


	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", nomProduit=" + nomProduit + ", dateExp=" + dateExp
				+ ", typeProduit=" + typeProduit + ", poidProduit=" + poidProduit + ", prixProduit=" + prixProduit
				+ ", qte_stock=" + qte_stock + ", produitFile=" + produitFile + ", codeAbarre=" + codeAbarre
				+ ", categorie=" + categorie + "]";
	}


	


	
	
	
	

}
