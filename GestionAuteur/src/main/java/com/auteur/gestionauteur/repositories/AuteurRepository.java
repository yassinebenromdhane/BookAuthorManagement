package com.auteur.gestionauteur.repositories;

import com.auteur.gestionauteur.entities.Auteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface AuteurRepository extends JpaRepository<Auteur, Integer> {
}