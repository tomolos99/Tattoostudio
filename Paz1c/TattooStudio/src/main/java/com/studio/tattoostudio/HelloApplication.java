package com.studio.tattoostudio;

import com.studio.tattoostudio.Controllers.LoginSceneController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        LoginSceneController controller = new LoginSceneController();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginScene.fxml"));
        loader.setController(controller);
        Parent parent = loader.load();
        Scene scene = new Scene(parent);
        primaryStage.setScene(scene);

    }

    public static void main(String[] args) {
        launch();
    }
}