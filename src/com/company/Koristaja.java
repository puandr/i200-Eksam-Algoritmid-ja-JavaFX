package com.company;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Loo JavaFXis koristaja mäng.
 * 1. Ekraan (näiteks 500x500) on paksult ringe täis. Nii, et läbi ei näe.
 * 2. Ringile hiirega vastu minnes kaob ring ära.
 * 3. Ringide all on peidus sõnum (näiteks Labeliga), mida kasutaja lõpuks näeb.
 */
public class Koristaja extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        int ringideRaadius = 50;

        StackPane rootPane = new StackPane();
        Scene koristajaStseen = new Scene(rootPane, 500, 500);
        primaryStage.setScene(koristajaStseen);

        Pane yleminePane = new Pane();
        GridPane aluminePane = new GridPane();
        aluminePane.setHgap(20);
        aluminePane.setVgap(20);


        Circle esimeneRinig = new Circle(ringideRaadius);
        Circle teineRing = new Circle(ringideRaadius);
        Circle kolmasRing = new Circle(ringideRaadius);

        esimeneRinig.setCenterX(50);
        esimeneRinig.setCenterY(50);
        teineRing.setCenterX(100);
        teineRing.setCenterY(100);
        kolmasRing.setCenterX(350);
        kolmasRing.setCenterY(350);

        esimeneRinig.setFill(Color.GREEN);
        teineRing.setFill(Color.GREEN);
        kolmasRing.setFill(Color.GREEN);


        Label esimeneLabel = new Label("One");
        esimeneLabel.setFont(new Font("Arial", 30));
        Label teineLabel = new Label("Two");
        Label kolmasLabel = new Label("Three");

        aluminePane.add(esimeneLabel, 0, 1);
        aluminePane.add(teineLabel, 3,3);
        aluminePane.add(kolmasLabel, 10,10);

        yleminePane.getChildren().addAll(esimeneRinig, teineRing, kolmasRing);


        rootPane.getChildren().addAll(aluminePane, yleminePane);
        //rootPane.getChildren().addAll(esimeneRinig, teineRing, kolmasRing);


        primaryStage.show();

        esimeneRinig.setOnMouseEntered(event -> {
            yleminePane.getChildren().remove(esimeneRinig);
            System.out.println("esimene ring");
        });

        teineRing.setOnMouseEntered(event -> {
            yleminePane.getChildren().remove(teineRing);
            System.out.println("teine ring");
        });

        kolmasRing.setOnMouseEntered(event -> {
            yleminePane.getChildren().remove(kolmasRing);
            System.out.println("kolmas ring");
        });
    }

}

