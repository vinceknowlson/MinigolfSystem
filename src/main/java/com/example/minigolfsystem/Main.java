package com.example.minigolfsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashSet;

public class Main extends Application {

    static Parent root;
    static Stage primaryStage;
    static Main m = null;
    static Boolean employeeMode;
    static User CurrentUser;
    static HashSet<Employee> employees = new HashSet<Employee>();
    static HashSet<Customer> customers = new HashSet<Customer>();

    static Parent getRoot(){
        return root;
    }

    static Stage getStage(){
        return primaryStage;
    }

    static void setRoot(Parent root){
        Main.root=root;
    }


    public static void main(String[] args) throws Exception {

        m = new Main();


        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        try {
            root = FXMLLoader.load(getClass().getResource("loginScene.fxml"));
            Main.primaryStage = primaryStage;
            Scene scene = new Scene(root, 320, 240);
            primaryStage.setTitle("Minigolf Booking System");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}