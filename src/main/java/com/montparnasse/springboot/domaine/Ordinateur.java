package com.montparnasse.springboot.domaine;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Ordinateur implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idOrdinateur;
	private String numero;
	private String os;
	private String marque;
	
	@JsonIgnore
	@OneToOne(mappedBy = "ordinateur")
	private Etudiant etudiant;

	public Long getIdOrdinateur() {
		return idOrdinateur;
	}

	public void setIdOrdinateur(Long idOrdinateur) {
		this.idOrdinateur = idOrdinateur;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	
	

}
