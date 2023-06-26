module pl.wsei_lab8 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens pl.lublin.wsei.java.cwiczenia.test to javafx.fxml;
    exports pl.lublin.wsei.java.cwiczenia.test;
    exports pl.lublin.wsei.java.cwiczenia;
    opens pl.lublin.wsei.java.cwiczenia to javafx.fxml;
}