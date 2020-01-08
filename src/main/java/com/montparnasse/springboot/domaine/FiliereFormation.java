package com.montparnasse.springboot.domaine;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class FiliereFormation implements Serializable {
	
	@EmbeddedId
	private FiliereFormationId id;

	private Date dateAffiliation;

	public FiliereFormationId getId() {
		return id;
	}

	public void setId(FiliereFormationId id) {
		this.id = id;
	}

	public Date getDateAffiliation() {
		return dateAffiliation;
	}

	public void setDateAffiliation(Date dateAffiliation) {
		this.dateAffiliation = dateAffiliation;
	}
	
	
}
