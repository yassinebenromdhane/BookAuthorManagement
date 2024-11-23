package com.auteur.gestionauteur.controllers;

import com.auteur.gestionauteur.entities.Auteur;
import com.auteur.gestionauteur.services.AuteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auteur")
public class AuteurConroller {
    @Autowired
    private AuteurService auteurService;

    @PostMapping("")
    public Auteur addAuteur(@RequestBody Auteur auteur) {
        return auteurService.sauvegarderAuteur(auteur);
    }

    @GetMapping("/{id}")
    public Auteur getAuteur(@PathVariable int id) {
        return auteurService.getAuteurById(id);
    }


}
