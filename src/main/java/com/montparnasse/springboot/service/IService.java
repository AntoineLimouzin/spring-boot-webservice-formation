package com.montparnasse.springboot.service;

import java.util.List;

import com.montparnasse.springboot.domaine.Etudiant;

public interface IService {
	
	public Etudiant add(Etudiant e);
	
	public Etudiant update(Etudiant e);
	
	public boolean delete(Long id);
	
	public Etudiant get(Long id);
	
	public List<Etudiant> getAll();

}
