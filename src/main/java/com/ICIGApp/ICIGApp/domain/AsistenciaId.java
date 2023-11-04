package com.ICIGApp.ICIGApp.domain;

import java.io.Serializable;

public class AsistenciaId implements Serializable {
    private int usuario;
    private int reunion;

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getReunion() {
        return reunion;
    }

    public void setReunion(int reunion) {
        this.reunion = reunion;
    }
}
