module com.example.wsei_lab4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.wsei_lab4 to javafx.fxml;
    exports com.example.wsei_lab4;
}