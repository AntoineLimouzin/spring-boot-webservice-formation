package com.montparnasse.springboot.domaine;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class FiliereFormationId implements Serializable {
	
	@ManyToOne
	@JoinColumn(name = "FiliereId")
	private Filiere filiere;
	
	@ManyToOne
	@JoinColumn(name = "FormationId")
	private Formation formation;

	public Filiere getFiliere() {
		return filiere;
	}

	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}

	public Formation getFormation() {
		return formation;
	}

	public void setFormation(Formation formation) {
		this.formation = formation;
	}
	
	

}
