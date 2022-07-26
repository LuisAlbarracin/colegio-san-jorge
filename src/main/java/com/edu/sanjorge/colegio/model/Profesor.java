package com.edu.sanjorge.colegio.model;

public class Profesor {

    private String codigo;
    private String nombres;
    private String apellidos;
    private Integer documentoIdentificacion;
    private String genero;

    public Profesor() {
    }

    public Profesor(String codigo, String nombres, String apellidos, Integer documentoIdentificacion, String genero) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.documentoIdentificacion = documentoIdentificacion;
        this.genero = genero;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getDocumentoIdentificacion() {
        return documentoIdentificacion;
    }

    public void setDocumentoIdentificacion(Integer documentoIdentificacion) {
        this.documentoIdentificacion = documentoIdentificacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
