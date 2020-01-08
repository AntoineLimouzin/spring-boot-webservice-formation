package com.montparnasse.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montparnasse.springboot.dao.OrdinateurDao;
import com.montparnasse.springboot.domaine.Ordinateur;

@Service
public class OrdinateurService {
	
	@Autowired
	private OrdinateurDao dao;
	
	public Ordinateur add(Ordinateur e)
	{
		return dao.save(e);
	}
	
	public Ordinateur update(Ordinateur e)
	{
		return dao.save(e);
	}
	
	public boolean delete(Long id)
	{
		dao.deleteById(id);
		return true;
	}
	
	public Ordinateur get(Long id)
	{
		return dao.findById(id).get();
	}
	
	public List<Ordinateur> getAll()
	{
		return dao.findAll();
	}

}
