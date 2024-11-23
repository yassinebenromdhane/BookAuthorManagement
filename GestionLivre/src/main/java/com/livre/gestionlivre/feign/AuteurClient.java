package com.livre.gestionlivre.feign;


import com.livre.gestionlivre.dtos.Auteur;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "GestionAuteur" , url = "http://localhost:9090")
public interface AuteurClient {

    @GetMapping("/auteur/{id}")
    Auteur getAuteur(@PathVariable int id);
}
