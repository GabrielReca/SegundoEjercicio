package com.example.SegundoEjercicio.controller;

import com.example.SegundoEjercicio.clases.Ciudad;
import com.example.SegundoEjercicio.clases.Persona;
import com.example.SegundoEjercicio.service.CiudadService;
import com.example.SegundoEjercicio.service.PersonaService;
import com.example.SegundoEjercicio.service.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {

/*    @Autowired
    PersonaService personaService;*/

    @Autowired
    CiudadService ciudadService;

  /*  @PostMapping("/introducirPersona")
    public String introducirPersona(@RequestBody Persona persona)
    {
        personaService.instanciar(persona.getNombre(), persona.getEdad(), persona.getCiudad());
        return persona.toString();
    }*/

    @PostMapping("/addCiudad")
    public String introducirPersona(@RequestBody Ciudad ciudad)
    {
        ciudadService.anhadirCiudad(ciudad);
        return ciudad.toString() + " - " + "peticion realizada";
    }


}
