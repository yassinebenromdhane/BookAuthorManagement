package com.livre.gestionlivre.repositories;

import com.livre.gestionlivre.entities.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivreRepository extends JpaRepository<Livre, Integer> {
    List<Livre> findByPrixLessThan(float prix);
}