package com.example.fronted.entities;

import java.util.List;

public class Slice {

    private  String nombre;
    private List<VM> maquinasVirtuales;
    private List<Enlace> enlaces;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<VM> getMaquinasVirtuales() {
        return maquinasVirtuales;
    }

    public void setMaquinasVirtuales(List<VM> maquinasVirtuales) {
        this.maquinasVirtuales = maquinasVirtuales;
    }

    public List<Enlace> getEnlaces() {
        return enlaces;
    }

    public void setEnlaces(List<Enlace> enlaces) {
        this.enlaces = enlaces;
    }
}
