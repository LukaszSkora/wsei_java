module com.example.wsei_lab3_fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.wsei_lab3 to javafx.fxml;
    exports com.example.wsei_lab3;
}