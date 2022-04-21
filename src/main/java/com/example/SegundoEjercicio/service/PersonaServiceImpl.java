package com.example.SegundoEjercicio.service;

import com.example.SegundoEjercicio.clases.Persona;
import org.springframework.stereotype.Service;

public class PersonaServiceImpl implements PersonaService{

    Persona persona = new Persona();

    public String getNombre()
    {
        return persona.getNombre();
    }

    public String getCiudad()
    {
        return persona.getCiudad();
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

    public void instanciar(String nombre, int edad, String ciudad)
    {
        persona.setNombre(nombre);
        persona.setEdad(edad);
        persona.setCiudad(ciudad);
    }
}
