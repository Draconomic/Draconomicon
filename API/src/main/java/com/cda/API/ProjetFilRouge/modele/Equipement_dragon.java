package com.cda.API.ProjetFilRouge.modele;

// import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name= "equipement_dragon")
@Getter
@Setter
@NoArgsConstructor
public class Equipement_dragon {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEquipementDragon;

	@Getter
	// @JoinColumn(name= "id_equipement")
	// @MapsId
	@Column(name="id_equipement")
	private int idEquipement;
	
	// @JoinColumn(name= "id_dragon")
	// @MapsId
	@Column(name="id_dragon")
	private int idDragon;

}