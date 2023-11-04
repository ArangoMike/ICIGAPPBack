package com.ICIGApp.ICIGApp.domain;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "Asistencia")
@Data
@IdClass(AsistenciaId.class)
public class Asistencia {
    @Id
    @Column(name = "Usuario_ID_Usuario")
    private int usuario;

    @Id
    @Column(name = "Reunion_ID_Reunion")
    private int reunion;
}
