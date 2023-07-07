package com.cda.API.ProjetFilRouge.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cda.API.ProjetFilRouge.modele.Attaque;
import com.cda.API.ProjetFilRouge.modele.Biome;
import com.cda.API.ProjetFilRouge.repository.AttaqueRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BiomeServiceImpl implements BiomeService{

	private AttaqueRepository biomeRepository;
	
	@Override
	public Biome creer(Biome biome) {
		return biomeRepository.save(biome);
	}

	@Override
	public List<Biome> lire() {
		return biomeRepository.findAll();
	}

	@Override
	public Biome modifier(Long id_biome, Biome biome) {
		return biomeRepository.findById(id_biome)
				.map(p-> {
					p.setIdBiome(biome.getIdBiome());
					p.setNameBiome(biome.getNameBiome());
					p.setIdWeather(biome.getIdWeather());
					return biomeRepository.save(p); 			
				}).orElseThrow(() -> new RuntimeException("Biome non trouvé"));
	}

	@Override
	public String supprimer(Long id_biome) {
		biomeRepository.deleteById(id_biome);
		return "Type de Biome supprimé";
	}

}
