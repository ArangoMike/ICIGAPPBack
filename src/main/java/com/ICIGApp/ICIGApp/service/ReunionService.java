package com.ICIGApp.ICIGApp.service;

import com.ICIGApp.ICIGApp.domain.Reunion;
import com.ICIGApp.ICIGApp.repository.ReunionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReunionService {
    private final ReunionRepository reunionRepository;

    @Autowired
    public ReunionService(ReunionRepository reunionRepository) {
        this.reunionRepository = reunionRepository;
    }

    public Reunion crearReunion(Reunion reunion) {
        // Lógica para crear una reunión
        return reunionRepository.save(reunion);
    }

    public List<Reunion> obtenerTodasLasReuniones() {
        // Lógica para obtener todas las reuniones
        return reunionRepository.findAll();
    }

    public Reunion obtenerReunionPorId(int id) {
        return reunionRepository.findById(id).orElse(null);
    }

    public Reunion actualizarReunion(int id, Reunion reunion) {
        reunion.setIdReunion(id);
        return reunionRepository.save(reunion);
    }

    public void eliminarReunion(int id) {

        reunionRepository.deleteById(id);
    }
}
