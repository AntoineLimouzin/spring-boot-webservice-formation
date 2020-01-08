package com.montparnasse.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.montparnasse.springboot.domaine.Etudiant;
import com.montparnasse.springboot.domaine.Formation;
import com.montparnasse.springboot.service.IServiceF;

@RestController
public class RestFormationController {
	
	@Autowired
	private IServiceF service;
	
	@RequestMapping(value = "/formations", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public List<Formation> getFormations()
	{
		return service.getAll();
	}
	
	@RequestMapping(value = "/formations/{id}/etudiants", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public List<Etudiant> getFormationEtudiants(@PathVariable("id") Long id)
	{
		return service.get(id).getEtudiants();
	}
	
	@RequestMapping(value = "/formations/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Formation getFormation(@PathVariable("id") Long id)
	{
		return service.get(id);
	}

	@RequestMapping(value = "/formations", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Formation addFormation(@RequestBody Formation e)
	{
		return service.add(e);
	}
	
	@RequestMapping(value = "/formations", method = RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Formation updateFormation(@RequestBody Formation e)
	{
		return service.update(e);
	}
	
	@RequestMapping(value = "/formations/{id}", method = RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public boolean deleteFormation(@PathVariable("id") Long id)
	{
		return service.delete(id);
	}
	
	
}
