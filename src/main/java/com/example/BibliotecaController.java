/**
 * La clase `BibliotecaController` en Java administra una interfaz de aplicación de biblioteca con
 * funcionalidades para agregar libros y manejar préstamos de libros.
 */
package com.example;

import com.example.models.Libro;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class BibliotecaController {

    @FXML
    private Button libro;

    @FXML
    private TableColumn<Libro, String> autor;

    @FXML
    private TableColumn<Libro, String> fecha;

    @FXML
    private TableColumn<Libro, String> id;

    @FXML
    private TableColumn<Libro, String> isbn;
    @FXML
    private TableView<Libro> table;

    @FXML
    private TableColumn<Libro, String> tematica;

    @FXML
    private TableColumn<Libro, String> titulo;

    @FXML
    private Button prestamo;

    public ObservableList<Libro> libros = FXCollections.observableArrayList();

    /**
     * La función `getLibros()` devuelve una ObservableList de objetos Libro.
     * 
     * @return Se devuelve una ObservableList de objetos Libro.
     */
    public ObservableList<Libro> getLibros() {
        return libros;
    }

    /**
     * La función `initialize` configura una vista de tabla JavaFX con fábricas de
     * valores de celda
     * específicas para cada columna.
     */
    @FXML
    private void initialize() {

        table.setItems(libros);
        id.setCellValueFactory(new PropertyValueFactory<>("idLibro"));
        titulo.setCellValueFactory(new PropertyValueFactory<>("titulo"));
        isbn.setCellValueFactory(new PropertyValueFactory<>("isbn"));
        autor.setCellValueFactory(new PropertyValueFactory<>("autor"));
        tematica.setCellValueFactory(new PropertyValueFactory<>("tematica"));
        fecha.setCellValueFactory(new PropertyValueFactory<>("fechaEdicion"));
    }

    /**
     * La función `addLibro` en Java carga una nueva ventana para agregar un libro,
     * recupera el libro
     * creado de la ventana y lo agrega a una lista si no es nulo.
     * 
     * @param event El parámetro `event` en el método `addLibro` es de tipo
     *              `ActionEvent`. Representa
     *              el evento que ocurrió cuando el usuario activó la acción, como
     *              hacer clic en un botón o
     *              seleccionar un elemento del menú. En este caso, se utiliza para
     *              manejar el evento de agregar un
     *              nuevo libro.
     */
    @FXML
    void addLibro(ActionEvent event) {
        // llamar a la ventana altaLibro.fxml
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("altaLibro.fxml"));
            fxmlLoader.load();
            Parent root = fxmlLoader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();

            // obtener el controlador de la ventana
            AltaLibroController altaLibroController = fxmlLoader.getController();

            // aagregar un listener para cuando la ventana se cierre
            stage.setOnHidden(e -> {
                // obtener el libro creado
                Libro libro = altaLibroController.getLibro();

                // si el libro no es null, agregarlo a la lista
                if (libro != null) {
                    libros.add(libro);
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * La función `prestamo` en Java carga un nuevo archivo FXML para una ventana de
     * préstamo, crea una
     * nueva etapa para mostrarlo y obtiene el controlador para la ventana.
     * 
     * @param event El parámetro `event` en el método `prestamo` de su controlador
     *              JavaFX representa el
     *              evento de acción que desencadenó el método. En JavaFX, un evento
     *              de acción ocurre cuando un
     *              usuario interactúa con un control, como hacer clic en un botón.
     *              El objeto de evento proporciona
     *              información sobre el evento que ocurrió,
     */
    @FXML
    void prestamo(ActionEvent event) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("prestamo.fxml"));
            fxmlLoader.load();
            Parent root = fxmlLoader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();

            // obtener el controlador de la ventana
            PrestamoController prestamoController = fxmlLoader.getController();

            // agregar un listener para cuando la ventana se cierre
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Esta función de Java actualiza una tabla con una entrada contable modificada.
     * 
     * @param libro El parámetro `libro` en el método `actualizarTabla` es un objeto
     *              de la clase `Libro`
     *              que representa un libro en el sistema. Este objeto se utiliza
     *              para actualizar la información de
     *              un libro en una tabla y refrescar la vista de la tabla para
     *              mostrar los
     */
    public void actualizarTabla(Libro libro) {
        // Encuentra el índice del dispositivo modificado en la lista de dispositivos
        int index = libros.indexOf(libro);

        // Reemplaza el dispositivo en la lista con la versión modificada
        libros.set(index, libro);

        // Refresca la tabla para mostrar los cambios
        table.refresh();
    }

    /**
     * Esta función Java `prestamoLibro` toma prestado un libro de una biblioteca
     * utilizando el ID del
     * libro y el ID del usuario.
     * 
     * @param bookId  El parámetro `bookId` representa el identificador único del
     *                libro que se pide
     *                prestado para el proceso de préstamo.
     * @param userDni El parámetro `userDni` probablemente representa el número de
     *                identificación único
     *                (DNI) del usuario que toma prestado el libro. Se utiliza para
     *                identificar al usuario en el
     *                sistema de la biblioteca y asociar el libro prestado con la
     *                cuenta de usuario correcta.
     */
    public void prestamoLibro(String bookId, String userDni) {
        // obtener la biblioteca
        BibliotecaController bibliotecaController = new BibliotecaController();
        // realizar el préstamo
        bibliotecaController.prestamoLibro(bookId, userDni);
    }

}
