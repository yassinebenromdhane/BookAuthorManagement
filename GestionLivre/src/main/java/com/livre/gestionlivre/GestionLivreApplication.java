package com.livre.gestionlivre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GestionLivreApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionLivreApplication.class, args);
	}

}
