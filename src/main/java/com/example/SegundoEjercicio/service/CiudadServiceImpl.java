package com.example.SegundoEjercicio.service;

import com.example.SegundoEjercicio.clases.Ciudad;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public class CiudadServiceImpl implements CiudadService{

    List<Ciudad> listaCiudades = new ArrayList<>();

    public void anhadirCiudad(Ciudad ciudad)
    {
        listaCiudades.add(ciudad);
    }

    public String mostrarCiudades()
    {
        String listaDeCiudades = "";

        for(Ciudad it: listaCiudades)
        {
            listaDeCiudades += it;
        }

        return listaDeCiudades;
    }
}
