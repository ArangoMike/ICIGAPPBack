package com.ICIGApp.ICIGApp.repository;

import com.ICIGApp.ICIGApp.domain.Membresia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembresiaRepository extends JpaRepository<Membresia, Integer> {

    // No se requiere agregar ningún método personalizado aquí,
    // ya que JpaRepository proporciona métodos CRUD básicos.

    // se puede agregar métodos personalizados si se necesita operaciones específicas.
}
