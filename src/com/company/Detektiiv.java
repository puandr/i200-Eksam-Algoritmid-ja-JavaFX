package com.company;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Stack;

/**
 * Tee JavaFXiga detektiivi mäng, kus kasutaja saab nähtamatuid ringe otsida.
 * 1. Ekraanil (näiteks 500x500) on suvalistes kohtades 3 ringi, mida näha ei ole.
 * 2. Hiirega ringile vastu minnes tuleb ring nähtavale.
 */

public class Detektiiv extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        int ringideRaadius = 50;

        Pane detektiiviStack = new Pane();
        Scene detektiiviStseen = new Scene(detektiiviStack, 500, 500);
        primaryStage.setScene(detektiiviStseen);

        Circle esimeneRinig = new Circle(ringideRaadius);
        Circle teineRing = new Circle(ringideRaadius);
        Circle kolmasRing = new Circle(ringideRaadius);

        esimeneRinig.setCenterX(Math.random()*450+ringideRaadius);
        esimeneRinig.setCenterY(Math.random()*450+ringideRaadius);
        teineRing.setCenterX(Math.random()*(500-ringideRaadius)+ringideRaadius);
        teineRing.setCenterY(Math.random()*(500-ringideRaadius)+ringideRaadius);
        kolmasRing.setCenterX(Math.random()*(500-ringideRaadius)+ringideRaadius);
        kolmasRing.setCenterY(Math.random()*(500-ringideRaadius)+ringideRaadius);

        esimeneRinig.setFill(Color.WHITE);
        teineRing.setFill(Color.WHITE);
        kolmasRing.setFill(Color.WHITE);

        detektiiviStack.getChildren().addAll(esimeneRinig, teineRing, kolmasRing);


        primaryStage.show();

        esimeneRinig.setOnMouseEntered(event -> {
            esimeneRinig.setFill(Color.BLACK);
            System.out.println("esimene ring");
        });

        teineRing.setOnMouseEntered(event -> {
            teineRing.setFill(Color.BLACK);
            System.out.println("teine ring");
        });

        kolmasRing.setOnMouseEntered(event -> {
            kolmasRing.setFill(Color.BLACK);
            System.out.println("kolmas ring");
        });
    }
}
