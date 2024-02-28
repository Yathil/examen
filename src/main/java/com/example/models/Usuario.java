package com.example.models;

import java.util.Date;

public class Usuario {
  private String dniUsuario;
  private Date fechaAltaSancion;

  public Usuario(String dniUsuario) {
    this.dniUsuario = dniUsuario;
    this.fechaAltaSancion = null;
  }

  public String getDniUsuario() {
    return dniUsuario;
  }

  public Date getFechaAltaSancion() {
    return fechaAltaSancion;
  }

  public void sancionar() {
    fechaAltaSancion = new Date();
  }

  public void quitarSancion() {
    fechaAltaSancion = null;
  }
}