package com.ICIGApp.ICIGApp.domain;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "Reunion")
@Data
public class Reunion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Reunion")
    private int idReunion;

    @Column(name = "nombre_reunion")
    private String nombreReunion;

    @Column(name = "fecha_reunion")
    private Date fechaReunion;

    @Column(name = "hora_reunion")
    private String horaReunion;

    @Column(name = "ubicacion_reunion")
    private String ubicacionReunion;

    @Column(name = "descripcion_reunion", length = 350)
    private String descripcionReunion;
}
