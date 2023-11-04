package com.ICIGApp.ICIGApp.service;

import com.ICIGApp.ICIGApp.domain.Membresia;
import com.ICIGApp.ICIGApp.repository.MembresiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembresiaService {
    private final MembresiaRepository membresiaRepository;

    @Autowired
    public MembresiaService(MembresiaRepository membresiaRepository) {
        this.membresiaRepository = membresiaRepository;
    }

    // Método para crear una membresía y guardarla en la base de datos
    public Membresia crearMembresia(Membresia membresia) {
        return membresiaRepository.save(membresia);
    }

    // Método para obtener todas las membresías de la base de datos
    public List<Membresia> obtenerTodasLasMembresias() {
        return membresiaRepository.findAll();
    }

    // Método para eliminar una membresía de la base de datos
    public void eliminarMembresia(Membresia membresia) {
        membresiaRepository.delete(membresia);
    }
}
