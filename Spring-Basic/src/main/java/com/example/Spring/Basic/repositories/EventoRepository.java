package com.example.Spring.Basic.repositories;

import com.example.Spring.Basic.entities.Evento;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class EventoRepository {

    private final List<Evento> eventos = new ArrayList<>();
    private long nextId = 1;



    public Evento save(Evento evento) {
        if (evento.getId() == null) {
         evento.setId(nextId++);
         eventos.add(evento);
        }
        return evento;
    }

    public List<Evento> findall(){
        return eventos;
    }

    public Optional <Evento> findById(Long id) {
        return eventos.stream()
                .filter(a -> a.getId().equals(id))
                .findFirst();
    }
}
