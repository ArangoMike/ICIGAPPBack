package com.ICIGApp.ICIGApp.service;

import com.ICIGApp.ICIGApp.domain.Asistencia;
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

    public Membresia crearMembresia(Membresia membresia) {
        return membresiaRepository.save(membresia);
    }

    public List<Membresia> obtenerTodasLasMembresias() {
        return membresiaRepository.findAll();
    }


    public void eliminarMembresia(Membresia membresia) {
        membresiaRepository.delete(membresia);
    }

}
