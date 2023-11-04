package com.ICIGApp.ICIGApp.controller;

import com.ICIGApp.ICIGApp.domain.Membresia;
import com.ICIGApp.ICIGApp.service.MembresiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/membresias")
public class MembresiaController {
    private final MembresiaService membresiaService;

    @Autowired
    public MembresiaController(MembresiaService membresiaService) {
        this.membresiaService = membresiaService;
    }

    // Controlador para obtener todas las membresías
    @GetMapping
    public ResponseEntity<List<Membresia>> obtenerTodasLasMembresias() {
        List<Membresia> membresias = membresiaService.obtenerTodasLasMembresias();
        return new ResponseEntity<>(membresias, HttpStatus.OK);
    }

    // Controlador para crear una nueva membresía
    @PostMapping
    public ResponseEntity<Membresia> crearMembresia(@RequestBody Membresia membresia) {
        Membresia nuevaMembresia = membresiaService.crearMembresia(membresia);
        return new ResponseEntity<>(nuevaMembresia, HttpStatus.CREATED);
    }

    // Controlador para eliminar una membresía
    @DeleteMapping
    public ResponseEntity<Void> eliminarMembresia(@RequestBody Membresia membresia) {
        membresiaService.eliminarMembresia(membresia);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
