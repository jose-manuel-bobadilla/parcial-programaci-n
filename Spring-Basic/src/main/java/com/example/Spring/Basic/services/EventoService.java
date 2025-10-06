package com.example.Spring.Basic.services;

import com.example.Spring.Basic.entities.Estudiante;
import com.example.Spring.Basic.entities.Evento;

import java.util.List;
public interface EventoService {

    Evento createEvento (Long id, String nombreEvento, String fechaEvento, Long duracion, String modalidad);
    Evento getEventoById(Long id);
    List<Evento> getEvento();
}
