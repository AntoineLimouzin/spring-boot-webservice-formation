package com.montparnasse.springboot.service;

import java.util.List;

import com.montparnasse.springboot.domaine.Ordinateur;

public interface IServiceO {
	
	public Ordinateur add(Ordinateur e);
	
	public Ordinateur update(Ordinateur e);
	
	public boolean delete(Long id);
	
	public Ordinateur get(Long id);
	
	public List<Ordinateur> getAll();

}
