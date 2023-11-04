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

    // Método para crear una reunión y guardarla en la base de datos
    public Reunion crearReunion(Reunion reunion) {
        return reunionRepository.save(reunion);
    }

    // Método para obtener todas las reuniones de la base de datos
    public List<Reunion> obtenerTodasLasReuniones() {
        return reunionRepository.findAll();
    }

    // Método para obtener una reunión por su identificador (ID)
    public Reunion obtenerReunionPorId(int id) {
        return reunionRepository.findById(id).orElse(null);
    }

    // Método para actualizar una reunión existente en la base de datos
    public Reunion actualizarReunion(int id, Reunion reunion) {
        reunion.setIdReunion(id);  // Establece el ID de la reunión a actualizar
        return reunionRepository.save(reunion);
    }

    // Método para eliminar una reunión por su identificador (ID)
    public void eliminarReunion(int id) {
        reunionRepository.deleteById(id);
    }
}
