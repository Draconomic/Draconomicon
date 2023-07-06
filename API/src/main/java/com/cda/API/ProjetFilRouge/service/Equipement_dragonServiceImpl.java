package com.cda.API.ProjetFilRouge.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cda.API.ProjetFilRouge.modele.Equipement_dragon;
import com.cda.API.ProjetFilRouge.repository.Equipement_dragonRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class Equipement_dragonServiceImpl implements Equipement_dragonService{

	private Equipement_dragonRepository equipement_dragonRepository;
	
	@Override
	public Equipement_dragon creer(Equipement_dragon equipement_dragon) {
		return equipement_dragonRepository.save(equipement_dragon);
	}

	@Override
	public List<Equipement_dragon> lire() {
		return equipement_dragonRepository.findAll();
	}

	@Override
	public Equipement_dragon modifier(Long id_equipement_dragon, Equipement_dragon equipement_dragon) {
		return equipement_dragonRepository.findById(id_equipement_dragon)
				.map(p-> {
					p.setIdEquipement(equipement_dragon.getIdEquipement());
					p.setIdDragon(equipement_dragon.getIdDragon());
					return equipement_dragonRepository.save(p); 			
				}).orElseThrow(() -> new RuntimeException("équipement non trouvé"));
	}

	@Override
	public String supprimer(Long id_equipement_dragon) {
		equipement_dragonRepository.deleteById(id_equipement_dragon);
		return "Equipement supprimé";
	}

}
