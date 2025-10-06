package com.example.Spring.Basic.entities;

public class Estudiante {

    private Long id;
    private Long cc;
    private String nombre;

    public Estudiante() {}

    public Estudiante(Long id, Long cc, String nombre) {
        this.id = id;
        this.cc = cc;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCc() {
        return cc;
    }

    public void setCc(Long cc) {
        this.cc = cc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

