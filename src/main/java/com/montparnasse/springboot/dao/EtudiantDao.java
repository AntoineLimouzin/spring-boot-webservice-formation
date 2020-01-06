package com.montparnasse.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.montparnasse.springboot.domaine.Etudiant;

@Repository
public interface EtudiantDao extends JpaRepository<Etudiant, Long> {

}
