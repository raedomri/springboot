package ConsomiTN.Entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.lang.NonNull;

@Entity
public class Events {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idEvents;
	@Temporal(TemporalType.DATE)
	@NonNull
	private Date dateEvents;
	@NonNull
	private String descEvents;
	@NonNull
	private String endroitEvents;
	@NonNull
	private Integer nbParticipant;
	@ManyToOne
	private Publicite publicite;
	
	public Publicite getPublicite() {
		return publicite;
	}
	public void setPublicite(Publicite publicite) {
		this.publicite = publicite;
	}
	public Long getIdEvents() {
		return idEvents;
	}
	public void setIdEvents(Long idEvents) {
		this.idEvents = idEvents;
	}
	public Date getDateEvents() {
		return dateEvents;
	}
	public void setDateEvents(Date dateEvents) {
		this.dateEvents = dateEvents;
	}
	public String getEndroitEvents() {
		return endroitEvents;
	}
	public void setEndroitEvents(String endroitEvents) {
		this.endroitEvents = endroitEvents;
	}
	public Integer getNbParticipant() {
		return nbParticipant;
	}
	public void setNbParticipant(Integer nbParticipant) {
		this.nbParticipant = nbParticipant;
		
	}
	public String getDescEvents() {
		return descEvents;
	}
	public void setDescEvents(String descEvents) {
		this.descEvents = descEvents;
	}
	public Events() {
		super();
		
	}
	public Events(Long idEvents,String descEvents, Date dateEvents, String endroitEvents, Integer nbParticipant) {
		super();
		this.idEvents = idEvents;
		this.dateEvents = dateEvents;
		this.endroitEvents = endroitEvents;
		this.nbParticipant = nbParticipant;
		this.descEvents= descEvents;
	}
	
	@Override
	public String toString() {
		return "Events [idEvents=" + idEvents + ", dateEvents=" + dateEvents + ",descEvents="+descEvents+ "endroitEvents=" + endroitEvents
				+ ", nbParticipant=" + nbParticipant + "]";
	}
	
	public void incrimentParticipate(){
		this.nbParticipant++;
	}

}
