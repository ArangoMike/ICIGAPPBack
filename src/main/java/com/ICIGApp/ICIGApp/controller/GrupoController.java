package com.ICIGApp.ICIGApp.controller;

import com.ICIGApp.ICIGApp.domain.Grupo;
import com.ICIGApp.ICIGApp.service.GrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grupos")
public class GrupoController {
    private final GrupoService grupoService;

    @Autowired
    public GrupoController(GrupoService grupoService) {
        this.grupoService = grupoService;
    }

    @PostMapping
    public ResponseEntity<Grupo> crearGrupo(@RequestBody Grupo grupo) {
        Grupo nuevoGrupo = grupoService.crearGrupo(grupo);
        return new ResponseEntity<>(nuevoGrupo, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Grupo>> obtenerTodosLosGrupos() {
        List<Grupo> grupos = grupoService.obtenerTodosLosGrupos();
        return new ResponseEntity<>(grupos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Grupo> obtenerGrupoPorId(@PathVariable int id) {
        Grupo grupo = grupoService.obtenerGrupoPorId(id);
        if (grupo != null) {
            return new ResponseEntity<>(grupo, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Grupo> actualizarGrupo(@PathVariable int id, @RequestBody Grupo grupo) {
        grupo.setIdGrupo(id);
        Grupo grupoActualizado = grupoService.actualizarGrupo(grupo);
        if (grupoActualizado != null) {
            return new ResponseEntity<>(grupoActualizado, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarGrupo(@PathVariable int id) {
        grupoService.eliminarGrupo(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
