package com.example.navegacion;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField txtUsuario;

    @FXML
    private PasswordField txtClave;

    @FXML
    private Label lblMensaje;

    @FXML
    protected void validarLogin() {
        String usuario = txtUsuario.getText();
        String clave = txtClave.getText();

        if (usuario.equals("admin") && clave.equals("1234")) {
            lblMensaje.setText("Bienvenido Administrador");
        } else if (usuario.equals("cajero") && clave.equals("5678")) {
            lblMensaje.setText("Bienvenido Cajero");
        } else {
            lblMensaje.setText("Usuario o contraseña incorrectos");
        }
    }
}

