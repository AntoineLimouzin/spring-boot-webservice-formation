package com.montparnasse.springboot.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.montparnasse.springboot.domaine.FiliereFormation;
import com.montparnasse.springboot.domaine.FiliereFormationId;
import com.montparnasse.springboot.service.FiliereFormationService;
import com.montparnasse.springboot.service.FiliereService;
import com.montparnasse.springboot.service.FormationService;

@RestController
public class RestFiliereFormationController {
	
	@Autowired
	private FiliereFormationService service;
	
	@Autowired
	private FiliereService serviceFi;
	
	@Autowired
	private FormationService serviceFo;
	
	@RequestMapping(value = "/ffs", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public List<FiliereFormation> getFiliereFormations()
	{
		return service.getAll();
	}
	
	@RequestMapping(value = "/ffs/{idFi}/{idFo}", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public FiliereFormation addFiliereFormation(@PathVariable("idFi") Long idFi, @PathVariable("idFo") Long idFo)
	{
		FiliereFormationId ffid = new FiliereFormationId();
		ffid.setFiliere(serviceFi.get(idFi));
		ffid.setFormation(serviceFo.get(idFo));
		FiliereFormation ff = new FiliereFormation();
		ff.setDateAffiliation(new Date());
		ff.setId(ffid);
		return service.add(ff);
	}
	
	@RequestMapping(value = "/ffs", method = RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public FiliereFormation updateFiliereFormation(@RequestBody FiliereFormation e)
	{
		return service.update(e);
	}
	
	
}
