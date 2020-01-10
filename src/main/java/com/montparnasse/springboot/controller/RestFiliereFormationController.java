package com.montparnasse.springboot.controller;

import java.util.ArrayList;
import java.util.Date;
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

import com.montparnasse.springboot.domaine.FiliereFormation;
import com.montparnasse.springboot.domaine.FiliereFormationId;
import com.montparnasse.springboot.domaine.Formation;
import com.montparnasse.springboot.service.FiliereFormationService;
import com.montparnasse.springboot.service.FiliereService;
import com.montparnasse.springboot.service.FormationService;

@CrossOrigin("*")
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
	
	@RequestMapping(value = "/filieres/{id}/formations", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public List<Formation> getFormationsOfFiliere(@PathVariable("id") Long id)
	{
		
		List<Formation> liste = new ArrayList<Formation>();
		
		for (FiliereFormation ff : serviceFi.get(id).getFiliereFormations()) {
				liste.add(ff.getId().getFormation());
		}
		
		return liste;
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
	
	//Méthode qui va permettre de modifier une entité
		@RequestMapping(value = "/filiereFormations/{numFiliere}/{numFormation}/{numNouvelleFormation}", method = RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON_VALUE})
		@ResponseBody
		public FiliereFormation updateFiliereFormation(@PathVariable("numFiliere") Long numFiliere, @PathVariable("numFormation") Long numFormation, @PathVariable("numNouvelleFormation") Long numNouvelleFormation) {
			//Création de la clé composée
			FiliereFormationId ffid = new FiliereFormationId();
			ffid.setFiliere(serviceFi.get(numFiliere));
			ffid.setFormation(serviceFo.get(numFormation));
			//Récupération de la filiereFormation précédente
			FiliereFormation filiereFormation = service.get(ffid);
			//Suppression de la filière précédente par sa clé composée
			service.delete(ffid);
			//Mise à jour de la clé composée
			ffid.setFormation(serviceFo.get(numNouvelleFormation));
			//Envoie de la mise à jour
			return service.update(filiereFormation);
		}
}
