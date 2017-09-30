package com.example.avalicao.api;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.example.avalicao.api.config.property.AvaliacaoApiProperty;


@SpringBootApplication
@EnableConfigurationProperties(AvaliacaoApiProperty.class)
public class AvaliacaoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AvaliacaoApiApplication.class, args);
	}
	
}
