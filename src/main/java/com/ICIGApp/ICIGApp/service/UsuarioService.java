package com.ICIGApp.ICIGApp.service;
import com.ICIGApp.ICIGApp.domain.Usuario;
import com.ICIGApp.ICIGApp.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario crearUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario); // Crea un nuevo usuario en la base de datos.
    }

    public Usuario actualizarUsuario(int id, Usuario usuarioActualizado) {
       usuarioActualizado.setCedula(id);

        return usuarioRepository.save(usuarioActualizado);
    }


    public Usuario obtenerUsuarioPorId(int id) {
        return usuarioRepository.findById(id).orElse(null); // Obtiene un usuario por ID.
    }

    public List<Usuario> obtenerTodosLosUsuarios() {
        return usuarioRepository.findAll(); // Obtiene todos los usuarios.
    }

    public void eliminarUsuario(int id) {
        usuarioRepository.deleteById(id); // Elimina un usuario por ID.
    }

}
