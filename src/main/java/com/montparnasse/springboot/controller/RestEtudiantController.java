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
import com.montparnasse.springboot.service.IService;

@RestController
public class RestEtudiantController {
	
	@Autowired
	private IService service;
	
	@RequestMapping(value = "/etudiants", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public List<Etudiant> getEtudiants()
	{
		return service.getAll();
	}
	
	@RequestMapping(value = "/etudiants/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Etudiant getEtudiant(@PathVariable("id") Long id)
	{
		return service.get(id);
	}

	@RequestMapping(value = "/etudiants", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Etudiant addEtudiant(@RequestBody Etudiant e)
	{
		return service.add(e);
	}
	
	@RequestMapping(value = "/etudiants", method = RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Etudiant updateEtudiant(@RequestBody Etudiant e)
	{
		return service.update(e);
	}
	
	@RequestMapping(value = "/etudiants/{id}", method = RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public boolean deleteEtudiant(@PathVariable("id") Long id)
	{
		return service.delete(id);
	}
}
