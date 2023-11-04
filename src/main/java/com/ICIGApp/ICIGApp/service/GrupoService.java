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

    public Grupo crearGrupo(Grupo grupo) {
        return grupoRepository.save(grupo);
    }

    public List<Grupo> obtenerTodosLosGrupos() {
        return grupoRepository.findAll();
    }

    public Grupo obtenerGrupoPorId(int id) {
        return grupoRepository.findById(id).orElse(null);
    }

    public Grupo actualizarGrupo(Grupo grupo) {
        return grupoRepository.save(grupo);
    }

    public void eliminarGrupo(int id) {
        grupoRepository.deleteById(id);
    }
}
