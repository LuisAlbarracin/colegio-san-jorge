package com.edu.sanjorge.colegio.model;

public class Curso {

    private String codigo;
    private String nombre;
    private Integer profesorTitular;
    private String jornada;

    public Curso(String codigo, String nombre, Integer profesorTitular, String jornada) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesorTitular = profesorTitular;
        this.jornada = jornada;
    }

    public Curso() {
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

    public Integer getProfesorTitular() {
        return profesorTitular;
    }

    public void setProfesorTitular(Integer profesorTitular) {
        this.profesorTitular = profesorTitular;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }
}
