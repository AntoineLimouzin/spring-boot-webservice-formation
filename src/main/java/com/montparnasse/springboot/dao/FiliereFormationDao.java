package com.montparnasse.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.montparnasse.springboot.domaine.FiliereFormation;
import com.montparnasse.springboot.domaine.FiliereFormationId;

public interface FiliereFormationDao extends JpaRepository<FiliereFormation, FiliereFormationId> {

}
