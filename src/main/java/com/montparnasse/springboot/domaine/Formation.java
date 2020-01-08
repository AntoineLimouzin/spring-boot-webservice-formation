package com.montparnasse.springboot.domaine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Formation implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFormation;
	private String intitule;
	private String commentaires;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "formation")
	private List<Etudiant> etudiants;
	
	@JsonIgnore
	@OneToMany(mappedBy = "id.formation")
	private List<FiliereFormation> filiereFormations = new ArrayList<FiliereFormation>();
	
	public Long getIdFormation() {
		return idFormation;
	}
	public void setIdFormation(Long idFormation) {
		this.idFormation = idFormation;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public String getCommentaires() {
		return commentaires;
	}
	public void setCommentaires(String commentaires) {
		this.commentaires = commentaires;
	}
	public List<Etudiant> getEtudiants() {
		return etudiants;
	}
	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}
	public List<FiliereFormation> getFiliereFormations() {
		return filiereFormations;
	}
	public void setFiliereFormations(List<FiliereFormation> filiereFormations) {
		this.filiereFormations = filiereFormations;
	}
	
	
	
}
