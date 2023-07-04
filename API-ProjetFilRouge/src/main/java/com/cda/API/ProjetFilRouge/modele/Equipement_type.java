package com.cda.API.ProjetFilRouge.modele;

// import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name= "equipement_type")
@Getter
@Setter
@NoArgsConstructor
public class Equipement_type {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
    private int idEquipementDragon;

	@Getter
	@Column(name="id_equipement")
	private int idEquipement;
	
	@Column(name="id_dragon")
	private int idDragon;

}