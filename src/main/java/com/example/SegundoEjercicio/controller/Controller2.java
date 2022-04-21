package com.example.SegundoEjercicio.controller;

import com.example.SegundoEjercicio.service.CiudadService;
import com.example.SegundoEjercicio.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller2 {

 /*   @Autowired
    PersonaService personaService;*/

    @Autowired
    CiudadService ciudadService;

 /*   @GetMapping("/multiplicarEdad")
    public String multiplicarEdad()
    {
        personaService.setEdad(personaService.getEdad() * 2);
        return personaService.toString();
    }*/

    @GetMapping("/getCiudad")
    public String getCiudad()
    {
        return ciudadService.mostrarCiudades();
    }
}
