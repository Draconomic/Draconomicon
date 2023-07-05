package com.cda.API.ProjetFilRouge.service;

import com.cda.API.ProjetFilRouge.modele.*;
import java.util.List;

public interface MessageService {
	Message creer(Message message);
	
	List<Message> lire();
	
	Message modifier(Long id_message, Message message);
	
	String supprimer(Long id_message);
}