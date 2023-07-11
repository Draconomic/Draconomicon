package com.draconomicon.api.service;

import com.draconomicon.api.model.Dragon;

import java.util.List;

public interface DragonService {
    Dragon creer(Dragon dragon);

    List<Dragon> lire();

    Dragon donne(Long id);


    Dragon modifier(Long id, Dragon dragon);

    String supprimer(Long id);
}
