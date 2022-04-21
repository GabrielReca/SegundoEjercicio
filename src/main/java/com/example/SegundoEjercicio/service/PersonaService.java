package com.example.SegundoEjercicio.service;

public interface PersonaService {

    String getNombre();

    void instanciar(String nombre, int edad, String ciudad);

    int getEdad();

    String getCiudad();

    void setEdad(int edad);

    String toString();
}
