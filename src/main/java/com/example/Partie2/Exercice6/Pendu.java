package com.example.Partie2.Exercice6;


import com.example.Partie1.Exercice2.Ex2;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Pendu {
    private int NbeDeVieRestant = 7;
    private String MotATrouver;
    public ImageView ChargerImageCorrespodante(int nbeDeVieRestant) {
        switch (nbeDeVieRestant) {
            case 7:
                return new ImageView(new Image(Ex2.class.getResource("Pendu7.png").toString()));
            case 6:
                return new ImageView(new Image(Ex2.class.getResource("Pendu6.png").toString()));
            case 5:
                return new ImageView(new Image(Ex2.class.getResource("Pendu5.png").toString()));
            case 4:
                return new ImageView(new Image(Ex2.class.getResource("Pendu4.png").toString()));
            case 3:
                return new ImageView(new Image(Ex2.class.getResource("Pendu3.png").toString()));
            case 2:
                return new ImageView(new Image(Ex2.class.getResource("Pendu2.png").toString()));
            case 1:
                return new ImageView(new Image(Ex2.class.getResource("Pendu1.png").toString()));
            case 0:
                return new ImageView(new Image(Ex2.class.getResource("Pendu0.png").toString()));
            default:
                return new ImageView(new Image(Ex2.class.getResource("PenduWin.png").toString()));
        }
    }
    public void start(Stage primaryStage) {
        VBox Fenetre = new VBox();

        //Image du pendu/victoire
        Label Image = new Label();
        Image.setGraphic(ChargerImageCorrespodante(NbeDeVieRestant));

        //Mot

        Label Mot = new Label();

        Scene scene = new Scene(Fenetre);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Premier exemple manipulant les conteneurs");
        primaryStage.show();
    }
    //MouseEvent.MOUSE_CLICKED
}
