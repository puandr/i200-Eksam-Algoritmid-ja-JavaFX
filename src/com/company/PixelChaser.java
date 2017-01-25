package com.company;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.*;
import javafx.stage.Stage;


/**
 * Joonista ekraanile hunnik ristkülikuid, suvalistel positsioonidel. Ühe korra kastile klikates
 * muutub ta 2x väiksemaks. Teist korda klikates kaob ta sootuks.
 */
public class PixelChaser extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        int teiseRistkylikuSuurus = 300;



        Pane rectanglePane = new Pane();
        Scene rectangleScene = new Scene(rectanglePane, 500, 500);
        primaryStage.setScene(rectangleScene);

        primaryStage.show();

        Rectangle esimeneRistkylik = new Rectangle(400, 400, 110, 170);
        rectanglePane.getChildren().add(esimeneRistkylik);

        esimeneRistkylik.setOnMouseClicked(event -> {
            if (esimeneRistkylik.getWidth() < 100) {
                rectanglePane.getChildren().remove(esimeneRistkylik);
                System.out.println("here");
            }
            esimeneRistkylik.setWidth(50);
            esimeneRistkylik.setHeight(50);
        });

        Rectangle teineRistkylik = new Rectangle(generateSuvalineKoordinaat(), generateSuvalineKoordinaat(), teiseRistkylikuSuurus, teiseRistkylikuSuurus);
        rectanglePane.getChildren().add(teineRistkylik);

        teineRistkylik.setOnMouseClicked(event -> {
            if (teineRistkylik.getWidth() < teiseRistkylikuSuurus ){
                rectanglePane.getChildren().remove(teineRistkylik);
            }
            teineRistkylik.setWidth(teiseRistkylikuSuurus/2);
            teineRistkylik.setHeight(teiseRistkylikuSuurus/2);
        });



    }

    static int generateSuvalineKoordinaat() {
        double suvaline = Math.random()*300;
        return (int) suvaline;
    }
}
