package com.example.Spring.Basic.services.Servicelmpl;


import com.example.Spring.Basic.entities.Evento;
import com.example.Spring.Basic.repositories.EventoRepository;
import com.example.Spring.Basic.services.EventoService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class EventoServicelmpl implements EventoService {

    private final EventoRepository eventoRepository;


    public EventoServicelmpl(EventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }

    @Override
    public Evento createEvento(String nombreEvento, String fechaEvento, Long duracion, String modalidad) {
        Evento evento = new Evento();
        evento.setNombreEvento(nombreEvento);
        evento.setFechaEvento(fechaEvento);
        evento.setDuracion(duracion);
        evento.setModalidad(modalidad);

        return eventoRepository.save(evento);
    }

    @Override
    public Evento getEventoById(Long id) {
        return eventoRepositoryfindById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Animal no encontrado")
        );
    }


    @Override
    public List<Evento> getEvento() {
        return eventoRepository.findAll();
    }
}
