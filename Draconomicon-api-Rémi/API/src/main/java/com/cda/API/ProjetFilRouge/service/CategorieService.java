package com.cda.API.ProjetFilRouge.service;

import com.cda.API.ProjetFilRouge.modele.*;
import java.util.List;

public interface CategorieService {
	Categorie creer(Categorie categorie);
	
	List<Categorie> lire();
	
	Categorie modifier(Long id_categorie, Categorie categorie);
	
	String supprimer(Long id_categorie);
}