package com.company;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Created by andrei on 21.01.2017.
 */
public class Tagaajamine extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane ringiPane = new Pane();
        Scene ringiScene = new Scene(ringiPane, 500, 500);
        primaryStage.setScene(ringiScene);
        primaryStage.show();

        Circle ring = new Circle(50);
        ringiPane.getChildren().add(ring);

        ring.setOnMouseEntered(event -> {
            ring.setCenterX(Math.random()*450);
            ring.setCenterY(Math.random()*450);
        });
    }
}
