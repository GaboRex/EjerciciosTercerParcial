module com.example.ejerciciostercerparcial {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejerciciostercerparcial to javafx.fxml;
    exports com.example.ejerciciostercerparcial;
}