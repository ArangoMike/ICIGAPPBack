package com.ICIGApp.ICIGApp.controller;

import com.ICIGApp.ICIGApp.domain.Asistencia;
import com.ICIGApp.ICIGApp.service.AsistenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/asistencias")
public class AsistenciaController {
    private final AsistenciaService asistenciaService;

    @Autowired
    public AsistenciaController(AsistenciaService asistenciaService) {
        this.asistenciaService = asistenciaService;
    }

    // Controlador para registrar un nuevo registro de asistencia
    @PostMapping
    public ResponseEntity<Asistencia> registrarAsistencia(@RequestBody Asistencia asistencia) {
        Asistencia nuevaAsistencia = asistenciaService.crearAsistencia(asistencia);
        return new ResponseEntity<>(nuevaAsistencia, HttpStatus.CREATED);
    }

    // Controlador para obtener todos los registros de asistencia
    @GetMapping
    public ResponseEntity<List<Asistencia>> obtenerTodasLasAsistencias() {
        List<Asistencia> asistencias = asistenciaService.obtenerTodasLasAsistencias();
        return new ResponseEntity<>(asistencias, HttpStatus.OK);
    }

    // Controlador para eliminar un registro de asistencia
    @DeleteMapping
    public ResponseEntity<Void> eliminarAsistencia(@RequestBody Asistencia asistencia) {
        asistenciaService.eliminarAsistencia(asistencia);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
