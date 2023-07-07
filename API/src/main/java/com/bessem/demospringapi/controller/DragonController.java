package com.bessem.demospringapi.controller;

import com.bessem.demospringapi.model.Dragon;
import com.bessem.demospringapi.model.Produit;
import com.bessem.demospringapi.service.DragonService;
import com.bessem.demospringapi.service.ProduitService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class DragonController {

    private final DragonService dragonService;

    @PostMapping("admin/dragon")
    public Dragon create(@RequestBody Dragon dragon) {
        return dragonService.creer(dragon);
    }

    @GetMapping({"public/dragon", "user/dragon", "admin/dragon"})
    public List<Dragon> read() {
        return dragonService.lire();
    }
    @GetMapping({"user/dragon/{id}", "admin/dragon/{id}"})
    public Dragon get(@PathVariable Long id) {
        return dragonService.donne(id);
    }


    @PutMapping("admin/dragon/{id}")
    public Dragon update(@PathVariable Long id, @RequestBody Dragon dragon) {
        return dragonService.modifier(id, dragon);
    }

    @DeleteMapping("admin/dragon/{id}")
    public String delete(@PathVariable Long id) {
        return dragonService.supprimer(id);
    }
}
