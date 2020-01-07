package com.montparnasse.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montparnasse.springboot.dao.FormationDao;
import com.montparnasse.springboot.domaine.Formation;

@Service
public class FormationService implements IServiceF {
	
	@Autowired
	private FormationDao dao;
	
	public Formation add(Formation e)
	{
		return dao.save(e);
	}
	
	public Formation update(Formation e)
	{
		return dao.save(e);
	}
	
	public boolean delete(Long id)
	{
		dao.deleteById(id);
		return true;
	}
	
	public Formation get(Long id)
	{
		return dao.findById(id).get();
	}
	
	public List<Formation> getAll()
	{
		return dao.findAll();
	}

}
