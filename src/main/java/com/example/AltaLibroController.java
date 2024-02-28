package com.example;

import java.util.Date;

import com.example.models.Biblioteca;
import com.example.models.Libro;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class AltaLibroController {

  @FXML
  private Button addButton;

  @FXML
  private TextField autorField;

  @FXML
  private TextField fechaField;

  @FXML
  private TextField idLibroField;

  @FXML
  private TextField isbnField;

  @FXML
  private TextField tematicaField;

  @FXML
  private TextField tituloField;

  private Libro libro;

  /**
   * La función `addBook` en un programa Java recupera los datos de un nuevo libro
   * y llama a un método para agregar un libro a un sistema de biblioteca.
   * 
   * @param event
   */
  @FXML
  void addBook(ActionEvent event) {

    // obtener los datos de los campos
    String id = idLibroField.getText();
    String titulo = tituloField.getText();
    String autor = autorField.getText();
    String isbn = isbnField.getText();
    String tematica = tematicaField.getText();
    String fecha = fechaField.getText();

    // crear un objeto libro
    this.libro = new Libro(id, titulo, isbn, autor, tematica, fecha);

    // enviar el objeto libro a la biblioteca
    Biblioteca biblioteca = Biblioteca.getInstance();
    biblioteca.altaLibro(libro);

    // cerrar la ventana
    addButton.getScene().getWindow().hide();

  }

  public Libro getLibro() {
    return libro;
  }

}
