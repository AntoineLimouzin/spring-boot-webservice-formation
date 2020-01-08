package com.montparnasse.springboot.domaine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Filiere implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFiliere;
	private String nomFiliere;
	
	@OneToMany(mappedBy = "id.filiere")
	private List<FiliereFormation> filiereFormations = new ArrayList<FiliereFormation>();

	public Long getIdFiliere() {
		return idFiliere;
	}

	public void setIdFiliere(Long idFiliere) {
		this.idFiliere = idFiliere;
	}

	public String getNomFiliere() {
		return nomFiliere;
	}

	public void setNomFiliere(String nomFiliere) {
		this.nomFiliere = nomFiliere;
	}

	public List<FiliereFormation> getFiliereFormations() {
		return filiereFormations;
	}

	public void setFiliereFormations(List<FiliereFormation> filiereFormations) {
		this.filiereFormations = filiereFormations;
	}
	
	
}
