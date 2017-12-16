package com.guiandrew.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MeuPrimeiroProjectoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeuPrimeiroProjectoApplication.class, args);
		
		System.out.println("O meu primeiro projecto em Spring!");
	}
}
