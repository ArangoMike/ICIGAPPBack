package com.ICIGApp.ICIGApp.domain;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "Grupo")
@Data
public class Grupo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Grupo")
    private int idGrupo;

    @Column(name = "nombre_grupo")
    private String nombreGrupo;

    @Column(name = "descripcion_grupo", length = 350)
    private String descripcionGrupo;

    @Column(name = "lider_grupo")
    private int liderGrupo;
}
