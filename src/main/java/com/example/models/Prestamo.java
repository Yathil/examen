package com.example.models;

import java.util.Date;

public class Prestamo {
    private String idLibro;
    private String dniUsuario;
    private String fechaDevolucion;

    public Prestamo(String idLibro, String dniUsuario, String fechaDevolucion) {
        this.idLibro = idLibro;
        this.dniUsuario = dniUsuario;
        this.fechaDevolucion = fechaDevolucion;
    }

    /**
     * 
     * @param idLibro
     * @param dniUsuario
     */
    public void prestar(String idLibro, String dniUsuario) {

    }

    /**
     * 
     * @param idLibro
     * @param dniUsuario
     */
    public void devolver(String idLibro, String dniUsuario) {

    }

    // Getters and Setters
    public String getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(String idLibro) {
        this.idLibro = idLibro;
    }

    public String getDniUsuario() {
        return dniUsuario;
    }

    public void setDniUsuario(String dniUsuario) {
        this.dniUsuario = dniUsuario;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}