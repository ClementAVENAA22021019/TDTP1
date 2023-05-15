module com.example.tdtp1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.tdtp1 to javafx.fxml;
    exports com.example.Partie1.Exercice1;
    exports com.example.Partie1.Exercice2;
    exports com.example.Partie2.Exercice3;
    exports com.example.Partie2.Exercice4;
    exports com.example.Partie2.Exercice5;
    //exports com.example.Partie2.Exercice6;
}