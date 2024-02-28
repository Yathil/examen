package com.example;

import com.example.models.Biblioteca;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrestamoController {

    @FXML
    private TextField bookIdField;

    @FXML
    private TextField userDniField;

    /**
     * La función `submitLoan` en un programa Java recupera la ID del libro y la ID
     * del usuario, luego
     * llama a un método para realizar un préstamo de libros en un sistema de
     * biblioteca.
     * 
     * @param event El parámetro `event` en el método `submitLoan` es de tipo
     *              `ActionEvent`. Representa
     *              el evento ocurrido, como un clic en un botón, que desencadenó el
     *              método a llamar. En este caso,
     *              el método se llama cuando el usuario envía una solicitud de
     *              préstamo.
     */
    @FXML
    void submitLoan(ActionEvent event) {
        // obtener el id del libro y el dni del usuario
        String bookId = bookIdField.getText();
        String userDni = userDniField.getText();

        // obtener la biblioteca
        BibliotecaController bibliotecaController = new BibliotecaController();
        // realizar el préstamo
        bibliotecaController.prestamoLibro(bookId, userDni);

    }

}
