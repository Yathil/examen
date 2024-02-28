/**
 * La clase `Libro` representa un libro con propiedades como ID, título, ISBN, autor, tema y fecha de
 * publicación.
 */
package com.example.models;

import java.util.Date;

public class Libro {
  private String idLibro;
  private String titulo;
  private String isbn;
  private String autor;
  private String tematica;
  private String fechaEdicion;

  public Libro() {

  }

  public Libro(String idLibro, String titulo, String isbn, String autor, String tematica, String fechaEdicion) {
    this.idLibro = idLibro;
    this.titulo = titulo;
    this.isbn = isbn;
    this.autor = autor;
    this.tematica = tematica;
    this.fechaEdicion = fechaEdicion;
  }

  public String getIdLibro() {
    return idLibro;
  }

  public void setIdLibro(String idLibro) {
    this.idLibro = idLibro;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getTematica() {
    return tematica;
  }

  public void setTematica(String tematica) {
    this.tematica = tematica;
  }

  public String getFechaEdicion() {
    return fechaEdicion;
  }

  public void setFechaEdicion(String fechaEdicion) {
    this.fechaEdicion = fechaEdicion;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Id: " + idLibro + "\n");
    sb.append("Libro: " + titulo + "\n");
    sb.append("ISBN: " + isbn + "\n");
    sb.append("Autor: " + autor + "\n");
    sb.append("Tematica: " + tematica + "\n");
    sb.append("Fecha de edicion: " + fechaEdicion + "\n");
    return sb.toString();
  }
}
