package com.example.minigolfsystem;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

public class sceneCreator {

    public static void loadScene(String sceneName) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(sceneName));
        Main.setRoot(fxmlLoader.load());
        Scene scene = new Scene(Main.getRoot());
        Main.getStage().setScene(scene);
        Main.getStage().show();

    }
}
