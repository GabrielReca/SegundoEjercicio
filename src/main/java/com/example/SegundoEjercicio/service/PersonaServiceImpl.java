package com.example.SegundoEjercicio.service;

import com.example.SegundoEjercicio.clases.Persona;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements PersonaService{

    Persona persona = new Persona();

    public String getNombre()
    {
        return persona.getNombre();
    }

    public int getEdad()
    {
        return persona.getEdad();
    }

    public void setEdad(int edad)
    {
        persona.setEdad(edad);
    }

    public String toString()
    {
        return persona.toString();
    }
}
