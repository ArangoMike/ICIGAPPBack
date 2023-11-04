package com.ICIGApp.ICIGApp.domain;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "Membresia")
@Data
@IdClass(MembresiaId.class)
public class Membresia {
    @Id
    @JoinColumn(name = "Grupo_ID_Grupo")
    private int grupo;

    @Id
    @JoinColumn(name = "Usuario_ID_Usuario")
    private int usuario;
}
