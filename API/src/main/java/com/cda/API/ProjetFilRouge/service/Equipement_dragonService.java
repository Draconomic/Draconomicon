package com.cda.API.ProjetFilRouge.service;

import com.cda.API.ProjetFilRouge.modele.*;
import java.util.List;

public interface Equipement_dragonService {
	Equipement_dragon creer(Equipement_dragon equipement_dragon);
	
	List<Equipement_dragon> lire();
	
	Equipement_dragon modifier(Long id_equipement_dragon, Equipement_dragon equipement_dragon);
	
	String supprimer(Long id_equipement_dragon);
}
