package com.ICIGApp.ICIGApp.domain;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "Usuario")
@Data
public class Usuario {
    @Id
    @Column(name = "ID_Usuario", unique = true)
    private String email;

    @Column(name = "nombre_usu")
    private String nombreUsu;

    @Column(name = "apellido_usu")
    private String apellidoUsu;

    @Column(name = "numero_celular_usu")
    private String numeroCelularUsu;

    @Column(name = "Contraseña_usu")
    private String contraseñaUsu;

    @Column(name = "rol_iglesia_usu")
    private String rolIglesiaUsu;
}
