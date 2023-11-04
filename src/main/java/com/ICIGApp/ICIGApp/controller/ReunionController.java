package com.ICIGApp.ICIGApp.controller;

import com.ICIGApp.ICIGApp.domain.Reunion;
import com.ICIGApp.ICIGApp.service.ReunionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reuniones")
public class ReunionController {
    private final ReunionService reunionService;

    @Autowired
    public ReunionController(ReunionService reunionService) {
        this.reunionService = reunionService;
    }

    // Controlador para crear una nueva reunión
    @PostMapping
    public ResponseEntity<Reunion> crearReunion(@RequestBody Reunion reunion) {
        Reunion nuevaReunion = reunionService.crearReunion(reunion);
        return new ResponseEntity<>(nuevaReunion, HttpStatus.CREATED);
    }

    // Controlador para obtener todas las reuniones
    @GetMapping
    public ResponseEntity<List<Reunion>> obtenerTodasLasReuniones() {
        List<Reunion> reuniones = reunionService.obtenerTodasLasReuniones();
        return new ResponseEntity<>(reuniones, HttpStatus.OK);
    }

    // Controlador para obtener una reunión por su identificador (ID)
    @GetMapping("/{id}")
    public ResponseEntity<Reunion> obtenerReunionPorId(@PathVariable int id) {
        Reunion reunion = reunionService.obtenerReunionPorId(id);
        if (reunion != null) {
            return new ResponseEntity<>(reunion, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Controlador para actualizar una reunión existente
    @PutMapping("/{id}")
    public ResponseEntity<Reunion> actualizarReunion(@PathVariable int id, @RequestBody Reunion reunion) {
        Reunion reunionActualizada = reunionService.actualizarReunion(id, reunion);
        if (reunionActualizada != null) {
            return new ResponseEntity<>(reunionActualizada, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Controlador para eliminar una reunión por su identificador (ID)
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarReunion(@PathVariable int id) {
        reunionService.eliminarReunion(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
