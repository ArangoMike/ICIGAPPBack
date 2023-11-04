package com.ICIGApp.ICIGApp.service;

import com.ICIGApp.ICIGApp.domain.Asistencia;
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

    // Método para crear un registro de asistencia y guardarlo en la base de datos
    public Asistencia crearAsistencia(Asistencia asistencia) {
        return asistenciaRepository.save(asistencia);
    }

    // Método para obtener todos los registros de asistencia de la base de datos
    public List<Asistencia> obtenerTodasLasAsistencias() {
        return asistenciaRepository.findAll();
    }

    // Método para eliminar un registro de asistencia de la base de datos
    public void eliminarAsistencia(Asistencia asistencia) {
        asistenciaRepository.delete(asistencia);
    }
}
