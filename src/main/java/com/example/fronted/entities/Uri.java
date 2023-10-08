package com.example.fronted.entities;

import java.util.List;

public class Uri {
    private String nombre;
    private String metodo;

    public Uri(String nombre, String metodo) {
        this.nombre = nombre;
        this.metodo = metodo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }
}
