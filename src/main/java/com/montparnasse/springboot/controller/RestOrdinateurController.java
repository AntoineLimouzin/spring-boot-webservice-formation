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

import com.montparnasse.springboot.domaine.Ordinateur;
import com.montparnasse.springboot.domaine.Formation;
import com.montparnasse.springboot.service.OrdinateurService;

@CrossOrigin("*")
@RestController
public class RestOrdinateurController {
	
	@Autowired
	private OrdinateurService service;
	
	@RequestMapping(value = "/ordinateurs", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public List<Ordinateur> getOrdinateurs()
	{
		return service.getAll();
	}
	
	@RequestMapping(value = "/ordinateurs/{id}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Ordinateur getOrdinateur(@PathVariable("id") Long id)
	{
		return service.get(id);
	}

	@RequestMapping(value = "/ordinateurs", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Ordinateur addOrdinateur(@RequestBody Ordinateur e)
	{
		return service.add(e);
	}
	
	@RequestMapping(value = "/ordinateurs", method = RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Ordinateur updateOrdinateur(@RequestBody Ordinateur e)
	{
		return service.update(e);
	}
	
	@RequestMapping(value = "/ordinateurs/{id}", method = RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public boolean deleteOrdinateur(@PathVariable("id") Long id)
	{
		return service.delete(id);
	}
}
