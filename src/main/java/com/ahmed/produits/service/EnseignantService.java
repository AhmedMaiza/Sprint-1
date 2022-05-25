package com.ahmed.produits.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.ahmed.produits.entities.Specilate;
import com.ahmed.produits.entities.Enseignant;

public interface EnseignantService {
	
	Enseignant saveEnseignant(Enseignant e);
	Enseignant updateEnseignant(Enseignant e);
	void deleteEnseignant(Enseignant e);
	void deleteEnseignantById(Long id);
	Enseignant getEnseignant(Long id);
	List<Enseignant> getAllEnseignants();
	List<Enseignant> findByNomEnseignant(String nom);
	List<Enseignant> findByNomEnseignantContains(String nom);
	List<Enseignant> findByOrderByNomEnseignantAsc();
	List<Enseignant> findBySpecilate (Specilate specilate);
	List<Enseignant> findByNomSalaire (String nom, Double salaire);
	List<Enseignant> findBySpecilateIdSpe(Long id);
	List<Enseignant> trierEnseignantsNomsSalaire ();
	Page<Enseignant> getAllEnseignantsParPage(int page, int size);

}
