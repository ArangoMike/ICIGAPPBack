package com.ICIGApp.ICIGApp.repository;

import com.ICIGApp.ICIGApp.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {
    // No se requiere agregar ningún método personalizado aquí,
    // ya que JpaRepository proporciona métodos CRUD básicos.

    // se puede agregar métodos personalizados si se necesita operaciones específicas.
}