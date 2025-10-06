package com.example.Spring.Basic.repositories;

import com.example.Spring.Basic.entities.Estudiante;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class EstudianteRepository {

    private final List<Estudiante> estudiantes =  new ArrayList<>();
    private long nextId = 1;

    public  Estudiante save(Estudiante estudiante){
        if (estudiante.getId() == null){
            estudiante.setId(nextId++);
            estudiantes.add(estudiante);
        }
        return  estudiante;
    }

    public List<Estudiante> findAll(){
        return estudiantes;
    }

    public Optional<Estudiante> findById(Long id) {
        return estudiantes.stream()
                .filter(a -> a.getId().equals(id))
                .findFirst();
        }
    }


