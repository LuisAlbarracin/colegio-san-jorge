package com.edu.sanjorge.colegio.model;

public class MateriaProfesorCurso {

    private Integer id;
    private Integer profesor;
    private String materia;
    private String curso;
    private String horario;

    public MateriaProfesorCurso() {
    }

    public MateriaProfesorCurso(Integer id, Integer profesor, String materia, String curso, String horario) {
        this.id = id;
        this.profesor = profesor;
        this.materia = materia;
        this.curso = curso;
        this.horario = horario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProfesor() {
        return profesor;
    }

    public void setProfesor(Integer profesor) {
        this.profesor = profesor;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
