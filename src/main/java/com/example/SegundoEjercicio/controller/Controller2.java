package com.example.SegundoEjercicio.controller;

import com.example.SegundoEjercicio.service.PersonaService;
import com.example.SegundoEjercicio.service.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller2 {

    @Autowired
    PersonaService personaService;

    @GetMapping("/multiplicarEdad")
    public String multiplicarEdad()
    {
        personaService.setEdad(personaService.getEdad() * 2);
        return personaService.toString();
    }

 /*   @GetMapping("/getCiudad")
    public String getCiudad()
    {
        personaService.setEdad(personaService.getEdad() * 2);
        return personaService.toString();
    }*/
}
