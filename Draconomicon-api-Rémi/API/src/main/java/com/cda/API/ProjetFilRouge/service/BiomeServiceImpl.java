package com.cda.API.ProjetFilRouge.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cda.API.ProjetFilRouge.modele.Biome;
import com.cda.API.ProjetFilRouge.repository.BiomeRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BiomeServiceImpl implements BiomeService {

	private BiomeRepository BiomeRepository;

	@Override
	public Biome creer(Biome biome) {
		return BiomeRepository.save(biome);
	}

	@Override
	public List<Biome> lire() {
		return BiomeRepository.findAll();
	}

	@Override
	public Biome modifier(Long id_biome, Biome biome) {
		return BiomeRepository.findById(id_biome)
				.map(p -> {
					p.setIdBiome(biome.getIdBiome());
					p.setNameBiome(biome.getNameBiome());
					p.setIdWeather(biome.getIdWeather());
					return BiomeRepository.save(p);
				}).orElseThrow(() -> new RuntimeException("Biome non trouvé"));
	}

	@Override
	public String supprimer(Long id_biome) {
		BiomeRepository.deleteById(id_biome);
		return "Type de Biome supprimé";
	}

}
