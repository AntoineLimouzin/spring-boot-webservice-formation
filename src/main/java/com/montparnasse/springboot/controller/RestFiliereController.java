package com.montparnasse.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.montparnasse.springboot.domaine.Filiere;
import com.montparnasse.springboot.service.FiliereService;

@CrossOrigin("*")
@RestController
public class RestFiliereController {
	
	@Autowired
	private FiliereService service;
	
	@RequestMapping(value = "/filieres", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public List<Filiere> getFilieres()
	{
		return service.getAll();
	}
	
	@RequestMapping(value = "/filieres/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Filiere getFiliere(@PathVariable("id") Long id)
	{
		return service.get(id);
	}

	@RequestMapping(value = "/filieres", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Filiere addFiliere(@RequestBody Filiere e)
	{
		return service.add(e);
	}
	
	
	@RequestMapping(value = "/filieres", method = RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Filiere updateFiliere(@RequestBody Filiere e)
	{
		return service.update(e);
	}
	
	@RequestMapping(value = "/filieres/{id}", method = RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public boolean deleteFiliere(@PathVariable("id") Long id)
	{
		return service.delete(id);
	}
}
