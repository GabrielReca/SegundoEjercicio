package com.example.SegundoEjercicio.controller;

import com.example.SegundoEjercicio.clases.Ciudad;
import com.example.SegundoEjercicio.clases.Persona;
import com.example.SegundoEjercicio.service.PersonaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {

    @PostMapping("/introducirPersona")
    public String introducirPersona(@RequestBody PersonaServiceImpl personaServiceImpl)
    {
        return personaServiceImpl.toString();
    }

  /*  @PostMapping("/addCiudad")
    public String introducirPersona(@RequestBody Ciudad ciudad)
    {
        return ciudad.toString();
    }*/


}
