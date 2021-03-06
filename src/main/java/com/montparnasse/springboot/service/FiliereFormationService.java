package com.montparnasse.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.montparnasse.springboot.dao.FiliereFormationDao;
import com.montparnasse.springboot.domaine.FiliereFormation;
import com.montparnasse.springboot.domaine.FiliereFormationId;

@Service
public class FiliereFormationService {
	
	@Autowired
	private FiliereFormationDao dao;
	
	public FiliereFormation add(FiliereFormation e)
	{
		return dao.save(e);
	}
	
	public FiliereFormation update(FiliereFormation e)
	{
		return dao.save(e);
	}
	
	public boolean delete(FiliereFormationId id)
	{
		dao.deleteById(id);
		return true;
	}
	
	public FiliereFormation get(FiliereFormationId id)
	{
		return dao.findById(id).get();
	}
	
	public List<FiliereFormation> getAll()
	{
		return dao.findAll();
	}

}
