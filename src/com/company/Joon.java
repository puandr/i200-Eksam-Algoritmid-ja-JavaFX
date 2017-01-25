package com.company;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * Created by andrei on 21.01.2017.
 */
public class Joon extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);

        TextField esimeneX = new TextField();
        esimeneX.setPromptText("Esimese punkti X");
        TextField esimeneY = new TextField();
        esimeneY.setPromptText("Esimese punkti Y");
        TextField teiseX = new TextField();
        teiseX.setPromptText("Teise punkti X");
        TextField teiseY = new TextField();
        teiseY.setPromptText("Teise punkti Y");

        Button joonistamiseNupp = new Button("Joonista joon");

        pane.add(esimeneX, 1, 0);
        pane.add(esimeneY, 1, 1);
        pane.add(teiseX, 1, 2);
        pane.add(teiseY, 1, 3);
        pane.add(joonistamiseNupp, 1, 4);

        primaryStage.show();

        joonistamiseNupp.setOnAction( event -> {
            int x1 = Integer.parseInt(esimeneX.getText());
            int y1 = Integer.parseInt(esimeneY.getText());
            int x2 = Integer.parseInt(teiseX.getText());
            int y2 = Integer.parseInt(teiseY.getText());
            Line joon = new Line(x1, y1, x2, y2);
            Pane joonePane = new Pane();
            Scene jooneScene = new Scene(joonePane, 500, 500);
            joonePane.getChildren().add(joon);
            System.out.println("enne sleepi");
            primaryStage.setScene(jooneScene);

        });

    }
}
