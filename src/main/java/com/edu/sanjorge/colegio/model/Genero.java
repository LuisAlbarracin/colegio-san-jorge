package com.edu.sanjorge.colegio.model;

public class Genero {

    private String codigo;
    private String nombre;

    public Genero(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Genero() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
