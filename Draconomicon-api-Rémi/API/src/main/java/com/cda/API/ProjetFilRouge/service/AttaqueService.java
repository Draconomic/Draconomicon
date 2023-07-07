package com.cda.API.ProjetFilRouge.service;

import com.cda.API.ProjetFilRouge.modele.*;
import java.util.List;

public interface AttaqueService {
	Attaque creer(Attaque attaque);
	
	List<Attaque> lire();
	
	Attaque modifier(Long id_attaque, Attaque attaque);
	
	String supprimer(Long id_attaque);
}
