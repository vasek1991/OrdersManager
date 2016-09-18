package com.metell_a.orders_manager;

import com.google.common.base.Joiner;
import com.google.common.primitives.Ints;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;

/**
 * Created by Vasiliy Kononenko.
 */
public class MainClass extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        URL url = getClass().getClassLoader().getResource("TableController.fxml");
        AnchorPane pane = FXMLLoader.load(url);
        Scene scene = new Scene(pane);

        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX TableView");
        primaryStage.show();
        // test Java Guava
        int[] array = {1, 2, 3};
        String s = Joiner.on(", ").join(Ints.asList(array));
        System.out.println(s);
    }
}