package com.example.fronted.entities;

public class Datos {
    private String Texto;
    private boolean input;
    private String nombreDato;

    private Uri uriSiguiente;

    private  String tipoDato;

    private Slice jsn;

    public Datos(String texto, boolean input, String nombreDato, Uri uriSiguiente) {
        Texto = texto;
        this.input = input;
        this.nombreDato = nombreDato;
        this.uriSiguiente = uriSiguiente;
    }

    public Datos(String texto, boolean input) {
        Texto = texto;
        this.input = input;
    }

    public Datos(String texto, boolean input, String nombreDato) {
        Texto = texto;
        this.input = input;
        this.nombreDato = nombreDato;
    }

    public Datos(String texto, boolean input, String nombreDato, String tipoDato, Slice jsn) {
        Texto = texto;
        this.input = input;
        this.nombreDato = nombreDato;
        this.tipoDato = tipoDato;
        this.jsn = jsn;
    }

    public String getTexto() {
        return Texto;
    }

    public void setTexto(String texto) {
        Texto = texto;
    }

    public boolean getInput() {
        return input;
    }

    public void setInput(boolean input) {
        this.input = input;
    }

    public boolean isInput() {
        return input;
    }

    public String getNombreDato() {
        return nombreDato;
    }

    public void setNombreDato(String nombreDato) {
        this.nombreDato = nombreDato;
    }

    public Uri getUriSiguiente() {
        return uriSiguiente;
    }

    public void setUriSiguiente(Uri uriSiguiente) {
        this.uriSiguiente = uriSiguiente;
    }

    public String getTipoDato() {
        return tipoDato;
    }

    public void setTipoDato(String tipoDato) {
        this.tipoDato = tipoDato;
    }

    public Slice getJsn() {
        return jsn;
    }

    public void setJsn(Slice jsn) {
        this.jsn = jsn;
    }
}
