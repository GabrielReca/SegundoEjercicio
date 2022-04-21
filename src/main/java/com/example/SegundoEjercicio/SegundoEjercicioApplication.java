package com.example.SegundoEjercicio;

import com.example.SegundoEjercicio.service.CiudadService;
import com.example.SegundoEjercicio.service.CiudadServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SegundoEjercicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(SegundoEjercicioApplication.class, args);
	}

	@Bean
	CiudadService getCiudadService()
	{
		CiudadService ciudadService = new CiudadServiceImpl();
		return ciudadService;
	}

}
