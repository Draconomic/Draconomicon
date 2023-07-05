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
	@Column(name="id_equipement_type")
	private int idEquipementType;
	
	@Column(name="type_equipement")
	private String typeEquipement;

}