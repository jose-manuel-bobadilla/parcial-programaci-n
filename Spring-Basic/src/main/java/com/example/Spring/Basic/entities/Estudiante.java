package com.example.Spring.Basic.entities;

public class Estudiante {

    private Long cc;
    private String nombre;

    public Estudiante() {
    }

    public Estudiante(Long cc, String nombre) {
        this.cc = cc;
        this.nombre = nombre;
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

