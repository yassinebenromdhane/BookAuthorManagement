package com.livre.gestionlivre.dtos;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Auteur {
    private Integer id;
    private String nom;
    private String prenom;
}
