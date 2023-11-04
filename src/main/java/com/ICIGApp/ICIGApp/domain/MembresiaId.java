package com.ICIGApp.ICIGApp.domain;

import java.io.Serializable;

public class MembresiaId implements Serializable {
    private int grupo;
    private int usuario;

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }
}

