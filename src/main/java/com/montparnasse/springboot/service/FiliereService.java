package com.montparnasse.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montparnasse.springboot.dao.FiliereDao;
import com.montparnasse.springboot.domaine.Filiere;

@Service
public class FiliereService {
	
	@Autowired
	private FiliereDao dao;
	
	public Filiere add(Filiere e)
	{
		return dao.save(e);
	}
	
	public Filiere update(Filiere e)
	{
		return dao.save(e);
	}
	
	public boolean delete(Long id)
	{
		dao.deleteById(id);
		return true;
	}
	
	public Filiere get(Long id)
	{
		return dao.findById(id).get();
	}
	
	public List<Filiere> getAll()
	{
		return dao.findAll();
	}

}
