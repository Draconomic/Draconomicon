package com.cda.API.ProjetFilRouge.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cda.API.ProjetFilRouge.modele.Categorie;
import com.cda.API.ProjetFilRouge.repository.CategorieRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CategorieServiceImpl implements CategorieService {

	private CategorieRepository categorieRepository;

	@Override
	public Categorie creer(Categorie categorie) {
		return categorieRepository.save(categorie);
	}

	@Override
	public List<Categorie> lire() {
		return categorieRepository.findAll();
	}

	@Override
	public Categorie modifier(Long id_categorie, Categorie categorie) {
		return categorieRepository.findById(id_categorie)
				.map(p -> {
					p.setTitre(categorie.getTitre());
					p.setCategorie(categorie.getCategorie());
					// p.setDatePost(categorie.getDatePost());
					p.setIdTopic(categorie.getIdTopic());
					p.setIdProfil(categorie.getIdProfil());
					return categorieRepository.save(p);
				}).orElseThrow(() -> new RuntimeException("Catégorie non trouvé"));
	}

	@Override
	public String supprimer(Long id_categorie) {
		categorieRepository.deleteById(id_categorie);
		return "Catégorie supprimé";
	}

}
