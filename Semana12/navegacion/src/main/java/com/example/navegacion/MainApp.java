package com.example.navegacion;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application{
    @Override
    public void start (Stage stage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/navegacion/Login.fxml"));
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Autenticacion de usuario");
        stage.show();
    }

    public static void main(String [] args){
        launch(args);
    }
}
