package com.ICIGApp.ICIGApp.service;

import com.ICIGApp.ICIGApp.domain.Asistencia;
import com.ICIGApp.ICIGApp.domain.Reunion;
import com.ICIGApp.ICIGApp.domain.Usuario;
import com.ICIGApp.ICIGApp.repository.AsistenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsistenciaService {
    private final AsistenciaRepository asistenciaRepository;

    @Autowired
    public AsistenciaService(AsistenciaRepository asistenciaRepository) {
        this.asistenciaRepository = asistenciaRepository;
    }

    public Asistencia crearAsistencia(Asistencia asistencia) {
        return asistenciaRepository.save(asistencia);
    }

    public List<Asistencia> obtenerTodasLasAsistencias() {
        return asistenciaRepository.findAll();
    }


    public void eliminarAsistencia(Asistencia asistencia) {
        asistenciaRepository.delete(asistencia);
    }
}

