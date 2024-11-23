package com.livre.gestionlivre.services;

import com.livre.gestionlivre.dtos.Auteur;
import com.livre.gestionlivre.entities.Livre;
import com.livre.gestionlivre.feign.AuteurClient;
import com.livre.gestionlivre.repositories.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivreService {
    @Autowired
    private LivreRepository livreRepository;
    @Autowired
    private AuteurClient auteurClient;


    public List<Livre> findAll() {
        List<Livre> livres = livreRepository.findAll();
        livres.forEach( livre -> livre.setAuteur(auteurClient.getAuteur(livre.getAuteurId())));
        return livres;
    }

    public Livre findById(int id) {
        Livre livre = livreRepository.findById(id).get();
        if (livre != null) {
            Auteur auteur =  auteurClient.getAuteur(livre.getAuteurId());
            livre.setAuteur(auteur);
        }

        return livre;
    }

    public Livre save(Livre livre) {
        return livreRepository.save(livre);
    }
}
