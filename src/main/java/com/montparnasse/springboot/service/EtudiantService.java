package com.montparnasse.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montparnasse.springboot.dao.EtudiantDao;
import com.montparnasse.springboot.domaine.Etudiant;

@Service
public class EtudiantService {
	
	@Autowired
	EtudiantDao dao;
	
	public void add(Etudiant e)
	{
		dao.save(e);
	}
	
	public void update(Etudiant e)
	{
		dao.save(e);
	}
	
	public void delete(Long id)
	{
		dao.deleteById(id);
	}
	
	public Etudiant get(Long id)
	{
		return dao.getOne(id);
	}
	
	public List<Etudiant> getAll()
	{
		return dao.findAll();
	}

}
