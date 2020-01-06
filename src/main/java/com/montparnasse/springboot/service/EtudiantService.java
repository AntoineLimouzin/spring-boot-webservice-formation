package com.montparnasse.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montparnasse.springboot.dao.EtudiantDao;
import com.montparnasse.springboot.domaine.Etudiant;

@Service
public class EtudiantService implements IService {
	
	@Autowired
	private EtudiantDao dao;
	
	public Etudiant add(Etudiant e)
	{
		return dao.save(e);
	}
	
	public Etudiant update(Etudiant e)
	{
		return dao.save(e);
	}
	
	public boolean delete(Long id)
	{
		dao.deleteById(id);
		return true;
	}
	
	public Etudiant get(Long id)
	{
		return dao.findById(id).get();
	}
	
	public List<Etudiant> getAll()
	{
		return dao.findAll();
	}

}
