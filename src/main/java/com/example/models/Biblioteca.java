package com.example.models;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase `Biblioteca` representa un sistema bibliotecario con funcionalidad
 * para gestionar libros,
 * préstamos y usuarios.
 */
public class Biblioteca {
    private List<Libro> libros;
    private List<Prestamo> prestamos;
    private List<Usuario> usuarios;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.prestamos = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void prestamoLibro(String idLibro) {
        for (Libro libro : libros) {
            if (libro.getIdLibro().equals(idLibro)) {
                libros.remove(libro);
                break;
            }
        }
    }

    public static Biblioteca getInstance() {
        return new Biblioteca();
    }

    public void altaLibro(Libro libro) {
        libros.add(libro);
    }

    public List<Libro> getLibros() {
        return libros;
    }
}