package com.example.SegundoEjercicio.service;

import com.example.SegundoEjercicio.clases.Ciudad;

import java.util.ArrayList;
import java.util.List;

public interface CiudadService {

    List<Ciudad> listaCiudades = new ArrayList<>();

    void anhadirCiudad(Ciudad ciudad);

    String mostrarCiudades();

}
