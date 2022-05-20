package ConsomiTN.Entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Publicite {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
 private Long idPublicite;
	private String nomPublicite;
	private String typePub;
	private Integer nbTv;
	private Integer nbFv;
	private Double cout;
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	@Temporal(TemporalType.DATE)
	private Date dateFin;
 private String canal;
 @OneToMany(mappedBy="publicite")
	private List<Events> events;
public Publicite() {
	super();
	
}
public Publicite(Long idPublicite, String nomPublicite, String typePub, Integer nbTv, Integer nbFv,
		Double cout, Date dateDebut, Date dateFin, String canal) {
	super();
	this.idPublicite = idPublicite;
	this.nomPublicite = nomPublicite;
	
	this.typePub = typePub;
	this.nbTv = nbTv;
	this.nbFv = nbFv;
	this.cout = cout;
	this.dateDebut = dateDebut;
	this.dateFin = dateFin;
	this.canal = canal;
}
public Long getIdPublicite() {
	return idPublicite;
}
public void setIdPublicite(Long idPublicite) {
	this.idPublicite = idPublicite;
}
public String getNomPublicite() {
	return nomPublicite;
}
public void setNomPublicite(String nomPublicite) {
	this.nomPublicite = nomPublicite;
}

public String getTypePub() {
	return typePub;
}
public void setTypePub(String typePub) {
	this.typePub = typePub;
}
public Integer getNbTv() {
	return nbTv;
}
public void setNbTv(Integer nbTv) {
	this.nbTv = nbTv;
}
public Integer getNbFv() {
	return nbFv;
}
public void setNbFv(Integer nbFv) {
	this.nbFv = nbFv;
}
public Double getCout() {
	return cout;
}
public void setCout(Double cout) {
	this.cout = cout;
}
public Date getDateDebut() {
	return dateDebut;
}
public void setDateDebut(Date dateDebut) {
	this.dateDebut = dateDebut;
}
public Date getDateFin() {
	return dateFin;
}
public void setDateFin(Date dateFin) {
	this.dateFin = dateFin;
}
public String getCanal() {
	return canal;
}
public void setCanal(String canal) {
	this.canal = canal;
}


@Override
public String toString() {
	return "Publicite [idPublicite=" + idPublicite + ", nomPublicite=" + nomPublicite 
			+ ", typePub=" + typePub + ", nbTv=" + nbTv + ", nbFv=" + nbFv + ", cout=" + cout + ", dateDebut="
			+ dateDebut + ", dateFin=" + dateFin + ", canal=" + canal + "]";
}
 
}
