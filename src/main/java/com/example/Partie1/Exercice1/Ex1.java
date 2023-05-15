package com.example.Partie1.Exercice1;

import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ex1 extends Application{
    @Override
    public void start(Stage primaryStage) {
        //Menu du haut
        MenuItem FileItem1 = new MenuItem("New");
        MenuItem FileItem2 = new MenuItem("Open");
        MenuItem FileItem3 = new MenuItem("Save");
        MenuItem FileItem4 = new MenuItem("Close");
        Menu File = new Menu("File");
        File.getItems().addAll(FileItem1, FileItem2, FileItem3, FileItem4);

        MenuItem EditItem1 = new MenuItem("Cut");
        MenuItem EditItem2 = new MenuItem("Copy");
        MenuItem EditItem3 = new MenuItem("Paste");
        Menu Edit = new Menu("Edit");
        Edit.getItems().addAll(EditItem1, EditItem2, EditItem3);

        Menu Help = new Menu("Help");
        MenuBar menuBar = new MenuBar(File, Edit, Help);

        //Boutons Gauche
        Label Txt = new Label();
        Txt.setText("Boutons :");
        Button B1 = new Button("Bouton 1");
        Button B2 = new Button("Bouton 2");
        Button B3 = new Button("Bouton 3");
        Separator sep = new Separator(Orientation.VERTICAL);

        //Agencement boutons
        VBox Gauche = new VBox();
        Gauche.getChildren().addAll(Txt, B1, B2, B3);
        Gauche.setAlignment( Pos.CENTER );
        Gauche.setMargin( Txt, new Insets(0.0d, 0.0d, 10.0d, 0.0d) );
        Gauche.setMargin( B1, new Insets(0.0d, 0.0d, 10.0d, 0.0d) );
        Gauche.setMargin( B2, new Insets(0.0d, 0.0d, 10.0d, 0.0d) );

        //Menu de droite
        VBox Droite = new VBox();
        HBox MBoutonDroite = new HBox();
        HBox CentrageDroite = new HBox();
        VBox FormulaireDroite = new VBox();
        GridPane GP = new GridPane();
        Label LName = new Label("Name:");
        Label LEmail = new Label("Email:");
        Label LPassword = new Label("Password:");
        TextField TName = new TextField();
        TextField TEmail = new TextField();
        TextField TPassword = new TextField();
        Button Submit = new Button("Submit");
        Button Cancel = new Button("Cancel");

        //Agencement des elements
        GP.add(LName, 0, 0);
        GP.add(LEmail, 0, 1);
        GP.add(LPassword, 0, 2);
        GP.add(TName, 1, 0);
        GP.add(TEmail, 1, 1);
        GP.add(TPassword, 1, 2);
        GP.setMargin( LName, new Insets(0.0d, 10.0d, 10.0d, 0.0d) );
        GP.setMargin( LEmail, new Insets(0.0d, 10.0d, 10.0d, 0.0d) );
        GP.setMargin( LPassword, new Insets(0.0d, 10.0d, 10.0d, 0.0d) );
        GP.setMargin( TName, new Insets(0.0d, 0.0d, 10.0d, 0.0d) );
        GP.setMargin( TEmail, new Insets(0.0d, 0.0d, 10.0d, 0.0d) );
        GP.setMargin( TPassword, new Insets(0.0d, 0.0d, 10.0d, 0.0d) );
        MBoutonDroite.getChildren().addAll(Submit, Cancel);
        MBoutonDroite.setMargin( Submit, new Insets(0.0d, 10.0d, 0.0d, 0.0d) );

        //Centrage
        FormulaireDroite.getChildren().addAll(GP, MBoutonDroite);
        CentrageDroite.getChildren().addAll(FormulaireDroite);
        CentrageDroite.setHgrow(FormulaireDroite, Priority.ALWAYS);
        FormulaireDroite.setAlignment(Pos.CENTER);
        Droite.getChildren().addAll(CentrageDroite);
        Droite.setAlignment( Pos.CENTER );



        //Bas de page
        HBox BDP = new HBox();
        Label BasDePage = new Label();
        BasDePage.setText("Ceci est un label de bas de page");
        BDP.setAlignment( Pos.CENTER );
        BDP.getChildren().add(BasDePage);

        //Fenetre
        VBox Fenetre = new VBox();
        HBox ConteneurMilieu = new HBox();
        Gauche.setVgrow(ConteneurMilieu, Priority.ALWAYS);
        Droite.setVgrow(ConteneurMilieu, Priority.ALWAYS);
        ConteneurMilieu.getChildren().addAll(Gauche, sep, Droite);
        Separator sep2 = new Separator(Orientation.HORIZONTAL);
        Fenetre.getChildren().addAll(menuBar, ConteneurMilieu, sep2, BDP);

        Scene scene = new Scene(Fenetre, 650, 400);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Premier exemple en manipulant des conteneurs");
        primaryStage.show();
    }
}