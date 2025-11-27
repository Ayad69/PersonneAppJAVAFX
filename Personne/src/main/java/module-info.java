module src.personne {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.sql;

    opens src.personne to javafx.fxml;
    exports src.personne;
}