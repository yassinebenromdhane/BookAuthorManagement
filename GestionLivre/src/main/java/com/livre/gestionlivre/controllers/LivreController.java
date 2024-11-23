package com.livre.gestionlivre.controllers;

import com.livre.gestionlivre.entities.Livre;
import com.livre.gestionlivre.services.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/livres")
public class LivreController {
    @Autowired
    private LivreService livreService;


    @GetMapping("")
    public List<Livre> getAllLivres() {
        return livreService.findAll();
    }
    @GetMapping("/{id}")
    public Livre getAllLivres(@PathVariable() Integer id) {
        return livreService.findById(id);
    }

    @PostMapping("")
    public Livre addLivre(@RequestBody Livre livre) {
        return livreService.save(livre);
    }




}
