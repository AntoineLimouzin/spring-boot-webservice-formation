package com.montparnasse.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.montparnasse.springboot.domaine.Etudiant;

@Repository
@Transactional
public interface EtudiantDao extends JpaRepository<Etudiant, Long> {
	
	@Modifying
	@Query("UPDATE Etudiant e set e.formation.idFormation= :idFormation WHERE e.idEtudiant = :idEtudiant")
	public void ajouterEtudiantFormation(@Param("idEtudiant") Long idEtudiant, @Param("idFormation") Long idFormation);
	
	@Modifying
	@Query("UPDATE Etudiant e set e.ordinateur.idOrdinateur= :idOrdinateur WHERE e.idEtudiant = :idEtudiant")
	public void ajouterOrdiEtudiant(@Param("idEtudiant") Long idEtudiant, @Param("idOrdinateur") Long idOrdinateur);

}
