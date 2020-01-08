package com.montparnasse.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.montparnasse.springboot.domaine.Filiere;

public interface FiliereDao extends JpaRepository<Filiere, Long> {

}
