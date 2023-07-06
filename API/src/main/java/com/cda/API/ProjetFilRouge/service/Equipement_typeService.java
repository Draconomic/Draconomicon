package com.cda.API.ProjetFilRouge.service;

import com.cda.API.ProjetFilRouge.modele.*;
import java.util.List;

public interface Equipement_typeService {
	Equipement_type creer(Equipement_type equipement_type);
	
	List<Equipement_type> lire();
	
	Equipement_type modifier(Long id_equipement_type, Equipement_type equipement_type);
	
	String supprimer(Long id_equipement_type);
}
