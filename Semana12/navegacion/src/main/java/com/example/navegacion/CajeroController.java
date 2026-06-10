package com.example.navegacion;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class CajeroController {

    @FXML private TextField txtCedula;
    @FXML private SplitMenuButton splProducto;
    @FXML private Spinner<Integer> spnCantidad;
    @FXML private TextField txtPrecio;

    @FXML
    public void initialize() {
        //configuracion del spinner del 1 al 10
        SpinnerValueFactory<Integer> valueFactory =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10, 1);
        spnCantidad.setValueFactory(valueFactory);

        //como forma opcional, configurar los items del menu para que al hacer clic se ponga un precio base
        for (MenuItem item : splProducto.getItems()) {
            item.setOnAction(e -> {
                splProducto.setText(item.getText());
                txtPrecio.setText("10.00"); // Precio de ejemplo
            });
        }
    }

    @FXML
    public void onPagarClick(ActionEvent event) {
        String cedula = txtCedula.getText();
        String producto = splProducto.getText();
        String precio = txtPrecio.getText();
        Integer cantidad = spnCantidad.getValue();

        if(cedula.isEmpty() || precio.isEmpty() || producto.equals("SplitMenuButton")) {
            System.out.println("Error: Asegúrate de llenar todo.");
        }else{
            //aqui va la logica final
            System.out.println("Pago exitoso. Cédula: " + cedula + ", Producto: " + producto +
                    ", Total: " + (Double.parseDouble(precio) * cantidad));
        }
    }
}
