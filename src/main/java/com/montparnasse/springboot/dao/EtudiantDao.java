package com.montparnasse.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.montparnasse.springboot.domaine.Etudiant;

@Repository
@Transactional
public interface EtudiantDao extends JpaRepository<Etudiant, Long> {

}
