package com.example.Spring.Basic.services.Servicelmpl;

import com.example.Spring.Basic.entities.Estudiante;
import com.example.Spring.Basic.repositories.EstudianteRepository;
import com.example.Spring.Basic.services.EstudiateService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EstudianteServiceImpl implements EstudiateService{

    private final EstudianteRepository estudianteRepository;


    public EstudianteServiceImpl(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    @Override
    public Estudiante createEstudiante(Long id, Long cc, String nombre) {
        Estudiante estudiante = new Estudiante();
        estudiante.setId(id);
        estudiante.setCc(cc);
        estudiante.setNombre(nombre);
        return estudianteRepository.save(estudiante);
    }

    @Override
    public Estudiante getEstudianteById(Long id) {
        return estudianteRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Estudiante no encontrado"));
    }

    @Override
    public List<Estudiante> getEstudiantes() {
        return estudianteRepository.findAll();
    }
}


