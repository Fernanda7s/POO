package com.example.navegacion;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class AdminController {

    //conexion de los fx:id del fxml ADMINISTRADOR
    @FXML private TextField txtCategoria;
    @FXML private TextField txtProducto;
    @FXML private TextField txtPrecio;
    @FXML private Spinner<Integer> spnCantidad;
    @FXML private Label lblMensaje;

    //
    @FXML
    public void initialize() {
        //configuracion del spinner para que acpete numeros del 1 al 10
        SpinnerValueFactory<Integer> valueFactory =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10, 1);
        spnCantidad.setValueFactory(valueFactory);
    }

    //logica para el boton ingresar
    @FXML
    public void oningresarclick(ActionEvent event) {
        String cat = txtCategoria.getText();
        String prod = txtProducto.getText();
        String precio = txtPrecio.getText();
        Integer cant = spnCantidad.getValue();

        if (cat.isEmpty() || prod.isEmpty() || precio.isEmpty()) {
            lblMensaje.setText("¡Error! Llena todos los campos.");
        } else {
            lblMensaje.setText("Registrado: " + prod + " en " + cat);
        }
    }

    //logica para el boton borrar
    @FXML
    public void onborrarclick(ActionEvent event) {
        txtCategoria.clear();
        txtProducto.clear();
        txtPrecio.clear();
        spnCantidad.getValueFactory().setValue(1); // Resetea el spinner
        lblMensaje.setText("Campos limpios.");
    }
}