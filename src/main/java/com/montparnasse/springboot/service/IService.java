package com.montparnasse.springboot.service;

import java.util.List;

import com.montparnasse.springboot.domaine.Etudiant;
import com.montparnasse.springboot.domaine.Formation;

public interface IService {
	
	public Etudiant add(Etudiant e);
	
	public Etudiant update(Etudiant e);
	
	public boolean delete(Long id);
	
	public Etudiant get(Long id);
	
	public List<Etudiant> getAll();
	
	public boolean ajouterEtudiantFormation(Long idEtudiant, Long idFormation);
	
	public boolean ajouterOrdiEtudiant(Long IdEtudiant, Long IdOrdi);
}
