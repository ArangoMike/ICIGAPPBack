package com.ICIGApp.ICIGApp.service;

import com.ICIGApp.ICIGApp.domain.Grupo;
import com.ICIGApp.ICIGApp.repository.GrupoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrupoService {
    private final GrupoRepository grupoRepository;

    @Autowired
    public GrupoService(GrupoRepository grupoRepository) {
        this.grupoRepository = grupoRepository;
    }

    // Método para crear un grupo y guardarlo en la base de datos
    public Grupo crearGrupo(Grupo grupo) {
        return grupoRepository.save(grupo);
    }

    // Método para obtener todos los grupos de la base de datos
    public List<Grupo> obtenerTodosLosGrupos() {
        return grupoRepository.findAll();
    }

    // Método para obtener un grupo por su identificador (ID)
    public Grupo obtenerGrupoPorId(int id) {
        return grupoRepository.findById(id).orElse(null);
    }

    // Método para actualizar un grupo existente en la base de datos
    public Grupo actualizarGrupo(Grupo grupo) {
        return grupoRepository.save(grupo);
    }

    // Método para eliminar un grupo por su identificador (ID)
    public void eliminarGrupo(int id) {
        grupoRepository.deleteById(id);
    }
}
