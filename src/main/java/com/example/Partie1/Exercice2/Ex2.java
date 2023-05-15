package com.example.Partie1.Exercice2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.Random;

public class Ex2 extends Application {
    public ImageView ChoisirImage() {
        Random random = new Random();
        int Chiffre = random.nextInt(3);
        if (Chiffre == 0){
            Image CImage = new Image(Ex2.class.getResource("Croix.png").toString());
            ImageView Image = new ImageView(CImage);
            return Image;
        } else if (Chiffre == 1) {
            Image CImage = new Image(Ex2.class.getResource("Rond.png").toString());
            ImageView Image = new ImageView(CImage);
            return Image;
        }else {
            Image CImage = new Image(Ex2.class.getResource("Vide.png").toString());
            ImageView Image = new ImageView(CImage);
            return Image;
        }
    }
    public void start(Stage primaryStage) throws Exception {
        //Grid et Cases
        GridPane GP = new GridPane();
        GP.setGridLinesVisible(true);
        Label i00 = new Label();
        Label i01 = new Label();
        Label i02 = new Label();
        Label i10 = new Label();
        Label i20 = new Label();
        Label i11 = new Label();
        Label i21 = new Label();
        Label i12 = new Label();
        Label i22 = new Label();

        //Disposition des cases
        GP.add(i00, 0, 0);
        GP.add(i01, 0, 1);
        GP.add(i02, 0, 2);
        GP.add(i10, 1, 0);
        GP.add(i11, 1, 1);
        GP.add(i12, 1, 2);
        GP.add(i20, 2, 0);
        GP.add(i21, 2, 1);
        GP.add(i22, 2, 2);

        //Application des images sur les cases
        Random random = new Random();
        i00.setGraphic(ChoisirImage());
        i01.setGraphic(ChoisirImage());
        i02.setGraphic(ChoisirImage());
        i10.setGraphic(ChoisirImage());
        i20.setGraphic(ChoisirImage());
        i11.setGraphic(ChoisirImage());
        i21.setGraphic(ChoisirImage());
        i12.setGraphic(ChoisirImage());
        i22.setGraphic(ChoisirImage());

        //Creation scene
        Scene scene = new Scene(GP);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.setTitle("TicTacToe");
        primaryStage.setWidth(133);
        primaryStage.setHeight(171);
        primaryStage.show();
    }
}