package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AtividadeRedesCiCdApplication {

	public static void main(String[] args) {
		GislaineController controller = new GislaineController();
		controller.exibirFrase();

	}

}
