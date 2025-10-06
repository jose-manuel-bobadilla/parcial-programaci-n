package com.example.Spring.Basic.services;

import com.example.Spring.Basic.entities.Estudiante;

import java.util.List;

public interface EstudiateService {

    Estudiante createEstudiante(Long id, Long cc, String nombre);
    Estudiante getEstudianteById(Long id);
    List<Estudiante> getEstudiantes();
}
