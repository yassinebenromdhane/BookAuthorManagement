package com.auteur.gestionauteur.services;
import com.auteur.gestionauteur.entities.Auteur;
import com.auteur.gestionauteur.repositories.AuteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AuteurService {
    @Autowired
    private AuteurRepository auteurRepository;

    public Auteur sauvegarderAuteur(Auteur auteur) {
        return auteurRepository.save(auteur);
    }

    public Auteur getAuteurById(int id) {

        return auteurRepository.findById(id).get();
    }
}
