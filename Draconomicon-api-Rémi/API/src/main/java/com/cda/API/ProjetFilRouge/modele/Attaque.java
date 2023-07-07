package com.cda.API.ProjetFilRouge.modele;

// import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name= "attaque")
@Getter
@Setter
@NoArgsConstructor
public class Attaque {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEquipementDragon;

	@Getter
	// @JoinColumn(name= "id_equipement")
	// @MapsId
	@Column(name="id_attaque")
	private int idAttaque;

	@Column(name="puissance")
	private int puissance;

	@Column(name="name_attaque")
	private int nameAttaque;

	@Column(name="physique")
	private int physique;

}