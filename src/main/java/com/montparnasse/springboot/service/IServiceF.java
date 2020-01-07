package com.montparnasse.springboot.service;

import java.util.List;

import com.montparnasse.springboot.domaine.Formation;

public interface IServiceF {
	
	public Formation add(Formation e);
	
	public Formation update(Formation e);
	
	public boolean delete(Long id);
	
	public Formation get(Long id);
	
	public List<Formation> getAll();

}
